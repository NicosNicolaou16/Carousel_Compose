package com.nicos.carousel_compose.data.pokemon_response_model

import com.nicos.carousel_compose.data.dto.PokemonDto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponse(
    @SerialName("next") val nextUrl: String?,
    @SerialName("results") val results: MutableList<PokemonDto>
) {
}