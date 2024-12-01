package com.bharat.toyotaapp.data

import com.google.gson.annotations.SerializedName


data class PlanetDTO(
    val name: String,
    val climate: String,
    val films: List<String>
)