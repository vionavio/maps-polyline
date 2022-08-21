package com.viona.mapspolyline.service.mapper

import com.viona.mapspolyline.model.entity.LocationData
import com.viona.mapspolyline.service.response.ReverseLocationResponse

object ResponseMapper {

    fun mapReverseLocationResponseToLocation(reverseLocationResponse: ReverseLocationResponse?): LocationData {
        val address = reverseLocationResponse?.data?.address.run {
            LocationData.Data.Address(
                city = this?.city.orEmpty(),
                country = this?.country.orEmpty(),
                district = this?.district.orEmpty()
            )
        }

        val coordinate = reverseLocationResponse?.data?.coordinate.run {
            LocationData.Data.Coordinate(
                latitude = this?.latitude ?: 0.0,
                longitude = this?.longitude ?: 0.0
            )
        }
        return LocationData(
            data = LocationData.Data(
                address = address,
                coordinate = coordinate,
                name = reverseLocationResponse?.data?.name.orEmpty()
            )
        )
    }

}