package com.example.navigationjetpackcompose.ui.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationjetpackcompose.ui.navigation.AUTH_ROUTE
import com.example.navigationjetpackcompose.ui.navigation.Screen
import com.example.navigationjetpackcompose.ui.screens.LoginScreen
import com.example.navigationjetpackcompose.ui.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
) {

    //AUTHENTICATION ROUTE
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_ROUTE
    ) {

        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }
    }
}