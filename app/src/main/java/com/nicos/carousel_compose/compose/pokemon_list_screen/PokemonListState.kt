package com.nicos.carousel_compose.compose.pokemon_list_screen

import com.nicos.carousel_compose.data.mappers.PokemonUi

data class PokemonListState(
    val pokemonMutableList: MutableList<PokemonUi>? = null,
    var nextPage: String? = null,
    val isLoading: Boolean = true,
    val error: String? = null,
)