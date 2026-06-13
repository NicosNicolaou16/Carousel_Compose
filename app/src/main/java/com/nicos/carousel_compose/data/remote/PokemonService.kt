package com.nicos.carousel_compose.data.remote

import com.nicos.carousel_compose.data.pokemon_response_model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Url

interface PokemonService {

    @GET("pokemon/")
    suspend fun getPokemon(): PokemonResponse

    @GET
    suspend fun getPokemon(@Url url: String): PokemonResponse
}