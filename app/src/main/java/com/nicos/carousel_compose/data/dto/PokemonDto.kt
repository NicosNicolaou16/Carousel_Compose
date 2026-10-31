package com.nicos.carousel_compose.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class PokemonDto(
    val name: String,
    val url: String?,
    var imageUrl: String?,
    var order: Int?,
)
