package com.nicos.carousel_compose.domain.dto

data class PokemonDto(
    val name: String,
    val url: String?,
    var imageUrl: String?,
    var order: Int?,
)
