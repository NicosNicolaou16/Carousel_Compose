package com.nicos.carousel_compose.compose.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nicos.carousel_compose.utils.screen_routes.PokemonList
import com.nicos.carousel_compose.compose.pokemon_list_screen.PokemonListScreen

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()
    SharedTransitionLayout {
        NavHost(
            navController = navController,
            startDestination = PokemonList
        ) {
            composable<PokemonList> {
                PokemonListScreen()
            }
        }
    }
}
