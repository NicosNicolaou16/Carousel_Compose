@file:OptIn(
    ExperimentalMaterial3Api::class,
)

package com.nicos.carousel_compose.compose.pokemon_list_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.nicos.carousel_compose.R
import com.nicos.carousel_compose.compose.generic_compose_views.CustomToolbar
import com.nicos.carousel_compose.compose.generic_compose_views.ShowDialog
import com.nicos.carousel_compose.compose.generic_compose_views.StartDefaultLoader
import com.nicos.carousel_compose.data.room_database.entities.PokemonEntity
import com.nicos.carousel_compose.ui.theme.GreenLight
import com.nicos.carousel_compose.utils.extensions.getProgressDrawable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PokemonListScreen() {
    Scaffold(topBar = {
        CustomToolbar(
            title = stringResource(R.string.pokemon_list),
        )
    }) { paddingValues ->
        CarouselPokemonList(
            paddingValues = paddingValues,
        )
    }
}

@Composable
fun CarouselPokemonList(
    paddingValues: PaddingValues, pokemonListViewModel: PokemonListViewModel = hiltViewModel()
) {
    val state = pokemonListViewModel.pokemonListState.collectAsState().value
    if (!state.error.isNullOrEmpty()) ShowDialog(
        title = stringResource(id = R.string.error), message = state.error
    )
    if (state.pokemonMutableList == null) return
    val carouselUncontainedState = rememberCarouselState {
        state.pokemonMutableList.size
    }
    val carouselMultiBrowseState = rememberCarouselState {
        state.pokemonMutableList.size
    }
    Column {
        Box(
            modifier = Modifier
                .height(350.dp)
                .padding(top = paddingValues.calculateTopPadding())
                .padding(top = 10.dp)
        ) {
            HorizontalUncontainedCarousel(
                state = carouselUncontainedState,
                itemWidth = 250.dp,
                itemSpacing = 19.dp,
                contentPadding = PaddingValues(start = 19.dp),
            ) { index ->
                val pokemonEntity = state.pokemonMutableList[index]
                LoadPokemonImage(
                    pokemonEntity = pokemonEntity,
                    modifier = Modifier
                        .maskClip(
                            MaterialTheme.shapes.extraLarge
                        )
                )
                LaunchedEffect(key1 = true) {
                    if (!state.nextPage.isNullOrEmpty() && state.pokemonMutableList.size - 1 == index) {
                        pokemonListViewModel.requestToFetchPokemon(
                            state.nextPage
                        )
                    }
                }
                if (state.isLoading) StartDefaultLoader()
            }
        }

        Box(
            modifier = Modifier
                .height(350.dp)
                .padding(top = paddingValues.calculateTopPadding())
                .padding(top = 10.dp)
        ) {
            HorizontalMultiBrowseCarousel(
                state = carouselMultiBrowseState,
                preferredItemWidth = 250.dp,
                itemSpacing = 19.dp,
                contentPadding = PaddingValues(start = 19.dp),
            ) { index ->
                val pokemonEntity = state.pokemonMutableList[index]
                LoadPokemonImage(
                    pokemonEntity = pokemonEntity,
                    modifier = Modifier
                        .maskClip(
                            MaterialTheme.shapes.extraLarge
                        )
                )
                LaunchedEffect(key1 = true) {
                    if (!state.nextPage.isNullOrEmpty() && state.pokemonMutableList.size - 1 == index) {
                        pokemonListViewModel.requestToFetchPokemon(
                            state.nextPage
                        )
                    }
                }
                if (state.isLoading) StartDefaultLoader()
            }
        }
    }
}

@Composable
fun LoadPokemonImage(
    pokemonEntity: PokemonEntity,
    modifier: Modifier,
) {
    val context = LocalContext.current
    Box(
        modifier = modifier
            .background(GreenLight)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = context).apply {
                data(pokemonEntity.imageUrl)
                placeholder(getProgressDrawable(context))
                error(android.R.drawable.stat_notify_error)
                fallback(android.R.drawable.stat_notify_error)
                memoryCachePolicy(CachePolicy.ENABLED)
            }.build(),
            modifier = modifier
                .fillMaxSize(),
            contentDescription = null,
            contentScale = ContentScale.None,
        )
    }
}