package com.viona.mapspolyline

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.viona.mapspolyline.databinding.ActivityMapsPickerBinding
import com.viona.mapspolyline.manager.LocationManager
import com.viona.mapspolyline.model.entity.LocationData
import com.viona.mapspolyline.service.mapper.ResponseMapper
import com.viona.mapspolyline.service.network.WebService
import com.viona.mapspolyline.utils.BaseActivityBinding
import com.viona.mapspolyline.utils.toLatLng
import com.viona.mapspolyline.utils.toast
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class MapsPickerActivity : BaseActivityBinding<ActivityMapsPickerBinding>() {

    private var isPannelShow = false

    private val locationManager by lazy { LocationManager(this) }

    private val webService by lazy {
        WebService.create()
    }

    override fun inflateBinding(): ActivityMapsPickerBinding {
        return ActivityMapsPickerBinding.inflate(layoutInflater)
    }

    override fun onCreateBinding(savedInstanceState: Bundle?) {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(onMapReady())

        hidePanel()
    }

    private fun onMapReady(): OnMapReadyCallback = OnMapReadyCallback { map ->
        map.uiSettings.isCompassEnabled = true
        map.uiSettings.isZoomControlsEnabled = true

        locationManager.getLastLocation { location ->
            val latLng = location.toLatLng()
            map.animateCamera(
                CameraUpdateFactory.newLatLngZoom(latLng, 12f)
            )
        }
        map.setOnCameraMoveListener {
            println("aaaa move")
            hidePanel()
        }

        map.setOnCameraIdleListener {
            println("aaaa idle ${map.cameraPosition.target}")
            runBlocking {
                val coordinate = map.cameraPosition.target
                println("loading")
                map.uiSettings.isScrollGesturesEnabled = false
                reverseLocation(coordinate)
                    .debounce(1000L)
                    .collect {
                        println("result -> ${it.data.name}")
                        onLocationResult(it)
                        map.uiSettings.isScrollGesturesEnabled = true
                    }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun onLocationResult(locationData: LocationData) {
        showPanel()
        with(binding) {
            tvLocationResult.text = "${locationData.data.name} \n ${locationData.data.address.country}"
        }
    }

    private fun hidePanel() {
        isPannelShow = false
        with(binding) {
            llPanelLocation.animate()
                .translationY(400f)
                .start()
        }
    }

    private fun reverseLocation(
        latLng: LatLng
    ): Flow<LocationData> {
        return flow {
            val coordinateString = "${latLng.latitude}, ${latLng.longitude}"
            val response = webService.reserveCoordinate(coordinateString)
            if (response.isSuccessful) {
                val data = ResponseMapper.mapReverseLocationResponseToLocation(response.body())
                emit(data)
            } else {
                toast("errpr: ${response.message()}")
            }
        }
    }

    private fun showPanel() {
        isPannelShow = true
        with(binding) {
            llPanelLocation.animate()
                .translationY(0f)
                .start()
        }
    }
}