package com.viona.mapspolyline

import android.Manifest
import android.os.Bundle
import com.viona.mapspolyline.databinding.ActivityMainBinding
import com.viona.mapspolyline.manager.LocationManager
import com.viona.mapspolyline.utils.BaseActivityBinding
import com.viona.mapspolyline.utils.intentTo
import pub.devrel.easypermissions.EasyPermissions

class MainActivity : BaseActivityBinding<ActivityMainBinding>() {

    private val locationManager: LocationManager by lazy {
        LocationManager(this)
    }


    override fun inflateBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreateBinding(savedInstanceState: Bundle?) {

        val fineLocation = Manifest.permission.ACCESS_FINE_LOCATION
        val coarseLocation = Manifest.permission.ACCESS_COARSE_LOCATION
        if (EasyPermissions.hasPermissions(this, fineLocation, coarseLocation)) {
            with(binding) {
                btnMaps.setOnClickListener {
                    intentTo(MapsActivity::class.java)
                }
                btnUser.setOnClickListener {
                    intentTo(UserActivity::class.java)
                }
                btnPickerMaps.setOnClickListener {
                    intentTo(MapsPickerActivity::class.java)
                }
            }
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

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    companion object {
        const val RC_LOCATION = 16
    }
}