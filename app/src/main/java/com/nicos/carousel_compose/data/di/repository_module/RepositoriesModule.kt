package com.nicos.carousel_compose.data.di.repository_module

import com.nicos.carousel_compose.data.remote.PokemonService
import com.nicos.carousel_compose.data.repository_impl.PokemonListRepositoryImpl
import com.nicos.carousel_compose.data.room_database.init_database.MyRoomDatabase
import com.nicos.carousel_compose.domain.repositories.PokemonListRepository
import com.nicos.carousel_compose.utils.generic_classes.HandlingError
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoriesModule {

    @Provides
    fun getPokemonListRepository(
        myRoomDatabase: MyRoomDatabase,
        pokemonService: PokemonService,
        handlingError: HandlingError
    ): PokemonListRepository {
        return PokemonListRepositoryImpl(
            myRoomDatabase,
            pokemonService,
            handlingError
        )
    }
}