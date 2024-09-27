package com.nicos.carousel_compose.data.models.pokemon_response_model

import com.google.gson.annotations.SerializedName
import com.nicos.carousel_compose.data.room_database.entities.PokemonEntity

data class PokemonResponse(
    @SerializedName("next") val nextUrl: String?,
    @SerializedName("results") val results: MutableList<PokemonEntity>
) {
}