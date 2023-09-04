package com.example.navigationjetpackcompose.ui.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navigationjetpackcompose.ui.navigation.DETAIL_ARGUMENT_KEY
import com.example.navigationjetpackcompose.ui.navigation.DETAIL_ARGUMENT_KEY2
import com.example.navigationjetpackcompose.ui.navigation.HOME_ROUTE
import com.example.navigationjetpackcompose.ui.navigation.Screen
import com.example.navigationjetpackcompose.ui.screens.DetailScreen
import com.example.navigationjetpackcompose.ui.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                //FOR OPTIONAL ARG
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                    /** nullable = true//if i don't want to pass default value, it will return null*/
                    /** nullable = true//if i don't want to pass default value, it will return null*/
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }
                //FOR REQUIRED ARG
                /**                navArgument(DETAIL_ARGUMENT_KEY) { type = NavType.IntType },
                navArgument(DETAIL_ARGUMENT_KEY2) { type = NavType.StringType }*/
            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController = navController)
        }
    }
}