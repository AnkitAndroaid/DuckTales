package com.ankit.ducktales.features.auth

import android.annotation.SuppressLint
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ankit.ducktales.features.auth.login.LoginScreen
import com.ankit.ducktales.features.auth.splash.SplashScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

const val authRoute = "auth"

sealed class AuthScreen(val route: String) {
    data object Splash : AuthScreen("$authRoute/splash")
    data object Login : AuthScreen("$authRoute/login")
    data object SignUp : AuthScreen("$authRoute/signup")
}

@SuppressLint("CoroutineCreationDuringComposition")
fun NavGraphBuilder.authNavGraph(
    onAuthSuccess: () -> Unit,
    navController: NavController
) {
    navigation(startDestination = AuthScreen.Splash.route, route = authRoute) {
        composable(AuthScreen.Splash.route) {
            SplashScreen()
            navController.navigate(AuthScreen.Login.route){
                popUpTo(0)
            }

        }
        composable(AuthScreen.Login.route) {
            LoginScreen(viewModel())
        }
    }

}