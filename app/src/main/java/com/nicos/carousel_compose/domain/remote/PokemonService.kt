package com.nicos.carousel_compose.domain.remote

import com.nicos.carousel_compose.domain.pokemon_response_model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Url

interface PokemonService {

    @GET("pokemon/")
    suspend fun getPokemon(): PokemonResponse

    @GET
    suspend fun getPokemon(@Url url: String): PokemonResponse
}