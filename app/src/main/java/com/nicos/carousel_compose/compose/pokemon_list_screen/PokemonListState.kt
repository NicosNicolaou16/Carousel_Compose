package com.nicos.carousel_compose.compose.pokemon_list_screen

import com.nicos.carousel_compose.data.room_database.entities.PokemonEntity

data class PokemonListState(
    val pokemonMutableList: MutableList<PokemonEntity>? = null,
    var nextPage: String? = null,
    val isLoading: Boolean = true,
    val error: String? = null,
)