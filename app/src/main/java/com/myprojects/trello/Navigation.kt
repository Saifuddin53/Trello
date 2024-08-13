package com.myprojects.trello

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myprojects.trello.presentation.ui.screens.sign.SignScreen

@Composable
fun Navigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) {
        }

        composable(route = Screen.SignScreen.route) {
            SignScreen()
        }
    }
}

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object SignScreen : Screen("sign_screen")
    object LoginScreen : Screen("login_screen")
    object SignUpScreen : Screen("sign_up_screen")
    object HomeScreen : Screen("home_screen")
}