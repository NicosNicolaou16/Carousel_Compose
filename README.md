# Carousel Compose

[![Linktree](https://img.shields.io/badge/linktree-1de9b6?style=for-the-badge&logo=linktree&logoColor=white)](https://linktr.ee/nicos_nicolaou)
[![Site](https://img.shields.io/badge/Site-blue?style=for-the-badge&label=Web)](https://nicosnicolaou16.github.io/)
[![X](https://img.shields.io/badge/X-%23000000.svg?style=for-the-badge&logo=X&logoColor=white)](https://twitter.com/nicolaou_nicos)
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/nicos-nicolaou-a16720aa)
[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@nicosnicolaou)
[![Mastodon](https://img.shields.io/badge/-MASTODON-%232B90D9?style=for-the-badge&logo=mastodon&logoColor=white)](https://androiddev.social/@nicolaou_nicos)
[![Bluesky](https://img.shields.io/badge/Bluesky-0285FF?style=for-the-badge&logo=Bluesky&logoColor=white)](https://bsky.app/profile/nicolaounicos.bsky.social)
[![Dev.to blog](https://img.shields.io/badge/dev.to-0A0A0A?style=for-the-badge&logo=dev.to&logoColor=white)](https://dev.to/nicosnicolaou16)
[![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)](https://www.youtube.com/@nicosnicolaou16)
[![Google Developer Profile](https://img.shields.io/badge/Developer_Profile-blue?style=for-the-badge&label=Google)](https://g.dev/nicolaou_nicos)

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
    *   [**Kotlin KTX**](https://developer.android.com/kotlin/ktx): A set of Kotlin extensions that provide concise, idiomatic Kotlin code for Android APIs.

## 🔧 Versioning

*   **Target SDK**: 37
*   **Minimum SDK**: 29
*   **Kotlin Version**: 2.4.0
*   **Gradle Version**: 9.2.1

## 🔗 API Endpoints

The data for this project is sourced from the following public APIs:

*   **PokéAPI**: [https://pokeapi.co/](https://pokeapi.co/)
*   **Pokémon Sprites**: [https://github.com/PokeAPI/sprites](https://github.com/PokeAPI/sprites)

## 📚 References

*   [Official Carousel Documentation](https://developer.android.com/reference/kotlin/androidx/compose/material3/carousel/package-summary)

## ⭐ Stargazers

If you enjoy this project, please give it a star!
Check out all the stargazers
here: [Stargazers on GitHub](https://github.com/NicosNicolaou16/Carousel_Compose/stargazers)

## 🙏 Support & Contributions

This project is actively maintained. Feedback, bug reports, and feature requests are welcome! Please feel free to **open an issue** or submit a **pull request**.