package sk.sandeep.bookreadercompose.navigation

enum class ReaderScreen {
    SplashScreen,
    LoginScreen,
    CreateAccountScreen,
    HomeScreen,
    SearchScreen,
    DetailScreen,
    UpdateScreen,
    ReaderStatsScreen, ;

    companion object {
        fun fromRoute(route: String): ReaderScreen = when (route.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            LoginScreen.name -> LoginScreen
            CreateAccountScreen.name -> CreateAccountScreen
            HomeScreen.name -> HomeScreen
            SearchScreen.name -> SearchScreen
            DetailScreen.name -> DetailScreen
            UpdateScreen.name -> UpdateScreen
            ReaderStatsScreen.name -> ReaderStatsScreen
            else -> throw IllegalArgumentException("Route $route is not found/recognized")
        }
    }
}