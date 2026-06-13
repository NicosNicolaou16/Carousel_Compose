@file:OptIn(ExperimentalMaterial3AdaptiveApi::class)

package com.nicos.carousel_compose.compose.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.nicos.carousel_compose.compose.navigation.navigation_3.Navigator
import com.nicos.carousel_compose.compose.navigation.navigation_3.navigationState
import com.nicos.carousel_compose.compose.pokemon_list_screen.PokemonListScreen
import com.nicos.carousel_compose.utils.screen_routes.PokemonList

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun Navigation() {
    // Navigation 3
    val navigationState = PokemonList.navigationState()
    val navigator = remember { Navigator(navigationState) }

    // Navigation Scene Strategy
    val listDetailStrategy = rememberListDetailSceneStrategy<NavKey>()

    SharedTransitionLayout {
        NavDisplay(
            backStack = navigationState.stacksInUse,
            onBack = {
                navigator.goBack()
            },
            sceneStrategies = listOf(listDetailStrategy),
            entryProvider = entryProvider {
                entry<PokemonList>(
                    metadata = ListDetailSceneStrategy.listPane()
                ) {
                    PokemonListScreen()
                }
            }
        )
    }
}
