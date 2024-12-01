package com.bharat.toyotaapp.data.remote

import com.bharat.toyotaapp.data.PlanetDTO
import retrofit2.http.GET

interface ApiService {

    @GET("api/planets/4")
    suspend fun getPlanets() : PlanetDTO
}