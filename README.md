# Carousel Compose

An open-source Android project that demonstrates the implementation of the new Carousel component in Material 3 using Jetpack Compose. It provides clear examples for both `HorizontalUncontainedCarousel` and `HorizontalMultiBrowseCarousel`.

> [!IMPORTANT]  
> For a detailed explanation, check out my article: 👉 [Carousel Jetpack Compose with Material 3 - Medium](https://medium.com/@nicosnicolaou/carousel-jetpack-compose-with-material-3-ca048d35278c) 👈

## 🚀 Examples

This project showcases different carousel implementations. Here is a preview of the `HorizontalMultiBrowseCarousel`:

<p align="left">
  <img src="examples/example_gif.gif" alt="Carousel Example GIF" height="500">
</p>

## 🛠️ Technologies & Libraries

This project is built with modern Android development tools and follows best practices.

*   **UI**:
    *   [**Jetpack Compose**](https://developer.android.com/develop/ui/compose): The entire UI is built with Google's modern declarative UI toolkit.
    *   [**Carousel for Material 3**](https://developer.android.com/reference/kotlin/androidx/compose/material3/carousel/package-summary): Implements a horizontally scrollable list of content like images or cards.
    *   [**Coil**](https://coil-kt.github.io/coil/compose/): An image loading library for Android backed by Kotlin Coroutines. Used for loading images asynchronously.

*   **Core & Architecture**:
    *   [**Kotlin**](https://kotlinlang.org/docs/getting-started.html): The official programming language for Android development.
    *   [**Kotlin Coroutines & Flow**](https://kotlinlang.org/docs/coroutines-overview.html): Used for managing background threads and handling asynchronous data streams.
    *   [**MVVM with Repository Pattern**](https://developer.android.com/topic/architecture#recommended-app-arch): Follows a recommended architecture to ensure a clear separation of concerns, making the app scalable and maintainable.
    *   [**UI State Management**](https://developer.android.com/topic/architecture/ui-layer/events#handle-viewmodel-events): Manages UI states such as `Initial`, `Loading`, `Success`, and `Error`.

*   **Dependency Injection & Networking**:
    *   [**Hilt**](https://developer.android.com/training/dependency-injection/hilt-android): A dependency injection library for Android that reduces the boilerplate of doing manual dependency injection.
    *   [**Retrofit**](https://square.github.io/retrofit/): A type-safe HTTP client for Android and Java to retrieve data from the remote server.
    *   [**Room Database**](https://developer.android.com/training/data-storage/room): A persistence library that provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite. It supports offline functionality.

*   **Build & Tooling**:
    *   [**KSP (Kotlin Symbol Processing)**](https://developer.android.com/build/migrate-to-ksp): An API for writing lightweight compiler plugins in Kotlin, offering significantly better build performance than KAPT.
    *   [**Navigation Type-Safety**](https://medium.com/androiddevelopers/navigation-compose-meet-type-safety-e081fb3cf2f8): Utilizes the latest type-safe navigation component for navigating between screens in Compose.
    *   [**Kotlin KTX**](https://developer.android.com/kotlin/ktx): A set of Kotlin extensions that provide concise, idiomatic Kotlin code for Android APIs.

## 🔧 Versioning

*   **Target SDK**: 36
*   **Minimum SDK**: 29
*   **Kotlin Version**: 2.3.0
*   **Gradle Version**: 8.13.2

## 🔗 API Endpoints

The data for this project is sourced from the following public APIs:

*   **PokéAPI**: [https://pokeapi.co/](https://pokeapi.co/)
*   **Pokémon Sprites**: [https://github.com/PokeAPI/sprites](https://github.com/PokeAPI/sprites)

## 📚 References

*   [Official Carousel Documentation](https://developer.android.com/reference/kotlin/androidx/compose/material3/carousel/package-summary)


<!--# Carousel Compose

The open-source project implements the new Carousel with Material 3 using Jetpack Compose and
provides two examples: `HorizontalUncontainedCarousel` and `HorizontalMultiBrowseCarousel`.

> [!IMPORTANT]  
> Check my article :point_right: [Carousel Jetpack Compose with Material 3 - Medium](https://medium.com/@nicosnicolaou/carousel-jetpack-compose-with-material-3-ca048d35278c) :point_left: <br />

# Examples

<p align="left">
  <a title="simulator_image"><img src="examples/example_gif.gif" height="500" width="200"></a>
</p>

# The Project Contain the following technologies

[Carousel Material 3 Jetpack Compose](https://developer.android.com/reference/kotlin/androidx/compose/material3/carousel/package-summary)
refers to a horizontally scrollable list that allows users to swipe through content such as images
or cards. It is part of the Material Design system and integrates well with Compose’s declarative UI
approach. <br />
The programming language is the [Kotlin](https://kotlinlang.org/docs/getting-started.html), it is a
modern, JVM-based programming language that is concise, safe, and interoperable with Java. <br />
[Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) is used for asynchronous
tasks. <br />
[Kotlin KTX](https://developer.android.com/kotlin/ktx) is a collection of Kotlin extensions that
offer more concise and expressive code for working with Android APIs and libraries.
The UI is build using [Jetpack Compose](https://developer.android.com/develop/ui/compose). <br />
[Retrofit](https://square.github.io/retrofit/) is responsible for making requests and retrieving
data from the remote server. ([Repository](https://github.com/square/retrofit)) <br />
[Room Database](https://developer.android.com/training/data-storage/room) is responsible for saving
the retrieved data from the remote server, querying data from the local database, and supporting
offline functionality.  <br />
[KSP](https://developer.android.com/build/migrate-to-ksp) ("Kotlin Symbol Processing") is a tool for
efficient annotation processing in Kotlin, providing faster code generation and symbol manipulation
compared to KAPT. [Repository](https://github.com/google/ksp) <br />
[Coil](https://coil-kt.github.io/coil/compose/) for Jetpack Compose is a library that it is
responsible for loading the images
asynchronous. ([Coil Documentation](https://coil-kt.github.io/coil/), [Repository](https://github.com/coil-kt/coil)) <br />
[Hilt Dependencies Injection](https://developer.android.com/training/dependency-injection/hilt-android)
is an Android library that simplifies dependency injection by using annotations to automatically
manage and provide dependencies across components, built on top of
Dagger. ([Documentation](https://dagger.dev/hilt/)) <br />
[MVVM](https://developer.android.com/topic/architecture#recommended-app-arch) with repository is an
architecture where the Repository manages data sources (e.g., network, database), the ViewModel
processes the data for the UI, and the View displays the UI, ensuring a clear separation of
concerns. <br />
For Navigation between screens is use
the [New Navigation Type Safety](https://medium.com/androiddevelopers/navigation-compose-meet-type-safety-e081fb3cf2f8). <br />
[UI State](https://developer.android.com/topic/architecture/ui-layer/events#handle-viewmodel-events)
to initial, loading, loaded and error. <br />

# Versioning

Target SDK version: 36 <br />
Minimum SDK version: 29 <br />
Kotlin version: 2.3.0 <br />
Gradle version: 8.13.2 <br />

# Feeds/Urls/End Point (parsing some data from the response)

## (Links References for Ends Points)

https://pokeapi.co/ <br />
https://github.com/PokeAPI/sprites (GitHub) <br />

# References

https://developer.android.com/reference/kotlin/androidx/compose/material3/carousel/package-summary
-->