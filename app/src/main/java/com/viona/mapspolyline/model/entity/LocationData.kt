package com.viona.mapspolyline.model.entity

class LocationData(
    val data: Data = Data(),
    val message: String = "",
    val status: Boolean = false
) {
    data class Data(
        val address: Address = Address(),
        val coordinate: Coordinate = Coordinate(),
        val name: String = ""
    ) {
        data class Address(
            val city: String = "",
            val country: String = "",
            val district: String = ""
        )

        data class Coordinate(
            val latitude: Double = 0.0,
            val longitude: Double = 0.0
        )
    }
}