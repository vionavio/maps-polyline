package com.viona.mapspolyline

import android.Manifest
import android.annotation.SuppressLint
import android.graphics.Color
import android.location.Location
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.viona.mapspolyline.databinding.ActivityMapsBinding
import com.viona.mapspolyline.manager.LocationManager
import com.viona.mapspolyline.utils.moveSmoothly
import com.viona.mapspolyline.utils.toLatLng
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.launch
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private val locationManager: LocationManager by lazy {
        LocationManager(this)
    }

    private var marker: Marker? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.uiSettings.isCompassEnabled = true
        mMap.uiSettings.isZoomControlsEnabled = true

        val routes = Sources.getResultRoutes()
        val coordinate = routes.data?.route.orEmpty()
            .map {
                LatLng(it?.latitude ?: 0.0, it?.longitude ?: 0.0)
            }

        val point1 = coordinate.firstOrNull()
        point1?.let {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(it, 14f))
        }

        val polyline = PolylineOptions()
            .addAll(coordinate)
            .width(6f)
            .color(Color.RED)
        mMap.addPolyline(polyline)

        getLocationWithPermission()

        binding.tvResultCoordinate.setOnClickListener { it ->
//            Intent(this, UserActivity::class.java).also {
//                startActivity(it)
//            }'
            locationManager.getLastLocation{
                Toast.makeText(this, it.toLatLng().toString(), Toast.LENGTH_SHORT).show()
            }


        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    @AfterPermissionGranted(value = RC_LOCATION)
    private fun getLocationWithPermission() {
        val fineLocation = Manifest.permission.ACCESS_FINE_LOCATION
        val coarseLocation = Manifest.permission.ACCESS_COARSE_LOCATION

        if (EasyPermissions.hasPermissions(this, fineLocation, coarseLocation)) {
            //get location
            getLocation()
        } else {
            EasyPermissions.requestPermissions(
                this,
                "Granted for location",
                RC_LOCATION,
                fineLocation,
                coarseLocation
            )
        }
    }

    @SuppressLint("MissingPermission")
    private fun getLocation() {
        MainScope().launch {
            locationManager.getLocationFlow().collect(onLocationResult())
        }
    }

    @SuppressLint("SetTextI18n")
    private fun onLocationResult() = FlowCollector<Location> { location ->
        binding.tvResultCoordinate.text = "${location.latitude}, ${location.longitude}"
        println("---------LOCATION UPDATE -> ${location.latitude}, ${location.longitude}")

        val newLatLng = LatLng(location.latitude, location.longitude)
        mMap.animateCamera(CameraUpdateFactory.newLatLng(newLatLng))

        if (marker == null) {
            val markerOption = MarkerOptions()
                .position(newLatLng)
            marker = mMap.addMarker(markerOption)
        } else {
            marker?.position = newLatLng
        }

        marker?.moveSmoothly(newLatLng)
    }

    companion object {
        const val RC_LOCATION = 16
    }
}