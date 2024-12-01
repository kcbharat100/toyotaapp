package com.bharat.toyotaapp.domain

import com.bharat.toyotaapp.data.PlanetDTO
import com.bharat.toyotaapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface PlanetRepository {
    suspend fun getPlanets(): Flow<Resource<Planet>>
}