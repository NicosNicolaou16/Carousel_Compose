package com.nicos.carousel_compose.data.pokemon_response_model

import com.google.gson.annotations.SerializedName
import com.nicos.carousel_compose.data.dto.PokemonDto

data class PokemonResponse(
    @SerializedName("next") val nextUrl: String?,
    @SerializedName("results") val results: MutableList<PokemonDto>
) {
}