package com.bharat.toyotaapp.data.repository

import android.util.Log
import com.bharat.toyotaapp.data.PlanetDTO
import com.bharat.toyotaapp.data.mappers.toPlanet
import com.bharat.toyotaapp.data.remote.ApiService
import com.bharat.toyotaapp.domain.Planet
import com.bharat.toyotaapp.domain.PlanetRepository
import com.bharat.toyotaapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class PlanetRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): PlanetRepository {
    override suspend fun getPlanets(): Flow<Resource<Planet>> {
       return flow{
            emit(Resource.Loading)

            try{
                val res = apiService.getPlanets().toPlanet()
                emit(Resource.Data(res))
            } catch (e: IOException){
               // emit(Resource.Error("Network error ${e.message.toString()}"))
            }
           // return@flow

        }
    }
}