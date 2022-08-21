package com.viona.mapspolyline.service.network

import com.viona.mapspolyline.service.response.ReverseLocationResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET(EndPoint.REVERSE)
    suspend fun reserveCoordinate(
        @Query("coordinateReverse") coordinate: String
    ): Response<ReverseLocationResponse>

    companion object {
        private const val BASE_URL = "https://c766-125-163-156-144.ap.ngrok.io"

        private val interceptor = run {
            val httpLoggingInterceptor = HttpLoggingInterceptor()

            httpLoggingInterceptor.apply {
                httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            }
        }

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)


        fun create(): WebService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build()
                .create(WebService::class.java)
        }
    }

    object EndPoint {
        const val REVERSE = "/api/location/reverse"
    }

}