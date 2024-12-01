package com.bharat.toyotaapp.data.mappers

import com.bharat.toyotaapp.data.PlanetDTO
import com.bharat.toyotaapp.domain.Planet

fun PlanetDTO.toPlanet(): Planet{
    return Planet(
        name = this.name,
        climate = this.climate,
        films = this.films
    )
}