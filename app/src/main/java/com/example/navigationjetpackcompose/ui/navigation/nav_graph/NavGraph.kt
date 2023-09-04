package com.example.navigationjetpackcompose.ui.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationjetpackcompose.ui.navigation.HOME_ROUTE
import com.example.navigationjetpackcompose.ui.navigation.ROOT_ROUTE

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)

    }
}