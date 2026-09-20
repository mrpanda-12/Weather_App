package com.elias.weatherapp.data.api.request

import com.elias.weatherapp.data.api.response.LocationApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationApi {

    @GET("search")
    suspend fun getLocation(
        @Query("city") city: String,
        @Query("country") country: String,
        @Query("format") format: String = "jsonv2"
    ): List<LocationApiResponse>
}