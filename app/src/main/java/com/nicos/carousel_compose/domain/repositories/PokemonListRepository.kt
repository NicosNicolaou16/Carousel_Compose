package com.nicos.carousel_compose.domain.repositories

import com.nicos.carousel_compose.data.mappers.PokemonUi
import com.nicos.carousel_compose.utils.generic_classes.Resource
import kotlinx.coroutines.flow.Flow

interface PokemonListRepository {
    suspend fun fetchPokemonList(url: String?): Flow<Resource<MutableList<PokemonUi>>>
    suspend fun offline(): Flow<Resource<MutableList<PokemonUi>>>
}

/*class PokemonListRepository @Inject constructor(
    private val myRoomDatabase: MyRoomDatabase,
    private val pokemonService: PokemonService,
    private val handlingError: HandlingError,
)*//* {

    companion object {
        private const val BASE_IMAGE_URL =
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/"
        private const val PNG_FORMAT = ".png"
    }

    suspend fun fetchPokemonList(url: String?): Resource<MutableList<PokemonEntity>> {
        return try {
            val pokemonService =
                if (url == null) pokemonService.getPokemon() else pokemonService.getPokemon(url)
            val nextUrl = pokemonService.nextUrl
            val pokemonEntityList = pokemonService.results
            savePokemon(pokemonEntityList = pokemonEntityList.map { it.toPokemonEntity() }
                .toMutableList())

            Resource.Success(data = myRoomDatabase.pokemonDao().getAllPokemon(), nextUrl = nextUrl)
        } catch (e: Exception) {
            Resource.Error(message = handlingError.handleErrorMessage(e))
        }
    }

    private suspend fun savePokemon(pokemonEntityList: MutableList<PokemonEntity>) {
        pokemonEntityList.forEach {
            buildPokemonImageUrl(it)
            if (it.imageUrl != null) {
                myRoomDatabase.pokemonDao().insertOrReplaceObject(it)
            }
        }
    }

    private fun buildPokemonImageUrl(pokemonEntity: PokemonEntity) {
        val pokemonIdAsString =
            pokemonEntity.url?.substringBeforeLast("/")?.substringAfterLast("/")
        if (pokemonIdAsString != null && pokemonIdAsString.isDigitsOnly()) {
            pokemonEntity.order = pokemonIdAsString.toInt()
            pokemonEntity.imageUrl = "$BASE_IMAGE_URL$pokemonIdAsString$PNG_FORMAT"
        }
    }

    suspend fun offline(): Resource<MutableList<PokemonEntity>> {
        return try {
            Resource.Success(data = myRoomDatabase.pokemonDao().getAllPokemon())
        } catch (e: Exception) {
            Resource.Error(message = handlingError.handleErrorMessage(e))
        }
    }
}*/