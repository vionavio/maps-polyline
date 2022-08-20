package com.viona.mapspolyline.manager

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.os.Looper
import com.google.android.gms.location.*
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.distinctUntilChanged

class LocationManager(private val context: Context) {

    private val fusedLocationProvider: FusedLocationProviderClient by lazy {
        LocationServices.getFusedLocationProviderClient(context)
    }

    private val locationRequest = LocationRequest.create().apply {
        priority = Priority.PRIORITY_HIGH_ACCURACY
        interval = 1000
    }

    private val distanceValidator = 30f

    @SuppressLint("MissingPermission")
    fun getLocationFlow(): Flow<Location> {
        val callbackFlow = callbackFlow<Location> {
            val locationCallback = object : LocationCallback() {
                override fun onLocationResult(result: LocationResult) {
                    for (location in result.locations) {
                        trySend(location)
                    }
                }
            }
            fusedLocationProvider.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.getMainLooper()
            ).addOnCanceledListener {
                cancel("Cancelled by user")
            }.addOnFailureListener {
                cancel("Get location failure")
            }

            awaitClose {
             fusedLocationProvider.removeLocationUpdates(locationCallback)
            }
        }

        return callbackFlow.distinctUntilChanged { old, new ->
            old.distanceTo(new) < distanceValidator
        }
    }
}