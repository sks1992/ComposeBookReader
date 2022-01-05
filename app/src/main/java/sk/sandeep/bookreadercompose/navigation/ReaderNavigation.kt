package sk.sandeep.bookreadercompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import sk.sandeep.bookreadercompose.screens.details.BookDetailScreen
import sk.sandeep.bookreadercompose.screens.home.HomeScreen
import sk.sandeep.bookreadercompose.screens.login.LoginScreen
import sk.sandeep.bookreadercompose.screens.search.SearchScreen
import sk.sandeep.bookreadercompose.screens.splash.ReaderSplashScreen
import sk.sandeep.bookreadercompose.screens.stats.ReaderStatsScreen
import sk.sandeep.bookreadercompose.screens.update.BookUpdateScreen

@Composable
fun ReaderNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ReaderScreen.SplashScreen.name
    ) {

        //for SplashScreen
        composable(ReaderScreen.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }

        //for HomeScreen
        composable(ReaderScreen.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        //for DetailScreen
        composable(ReaderScreen.DetailScreen.name) {
            BookDetailScreen(navController = navController)
        }

        //for SearchScreen
        composable(ReaderScreen.SearchScreen.name) {
            SearchScreen(navController = navController)
        }
        //for ReaderStatsScreen
        composable(ReaderScreen.ReaderStatsScreen.name) {
            ReaderStatsScreen(navController = navController)
        }
        //for UpdateScreen
        composable(ReaderScreen.UpdateScreen.name) {
            BookUpdateScreen(navController = navController)
        }

        //for LoginScreen
        composable(ReaderScreen.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
    }
}