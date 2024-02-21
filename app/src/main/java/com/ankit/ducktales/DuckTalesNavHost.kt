package com.ankit.ducktales

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ankit.ducktales.features.auth.authNavGraph
import com.ankit.ducktales.features.auth.authRoute

@Composable
fun DuckTalesNavHost(navHostController: NavHostController){

    NavHost(navController = navHostController, startDestination = authRoute ){
        authNavGraph(
            navController = navHostController,
            onAuthSuccess = {

            }
        )
    }
}