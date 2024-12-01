package com.bharat.toyotaapp.presentation

import com.bharat.toyotaapp.data.PlanetDTO

data class PlanetUIState(
    val isLoading: PlanetUIState,
    val planet: PlanetDTO,
    val errorMessage: String
)