package com.example.navigationjetpackcompose.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigationjetpackcompose.DETAIL_ARGUMENT_KEY
import com.example.navigationjetpackcompose.DETAIL_ARGUMENT_KEY2
import com.example.navigationjetpackcompose.Screen
import com.example.navigationjetpackcompose.ui.screens.DetailScreen
import com.example.navigationjetpackcompose.ui.screens.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                //FOR OPTIONAL ARG
                navArgument(DETAIL_ARGUMENT_KEY){
                    type = NavType.IntType
                    defaultValue = 0
                   /** nullable = true//if i don't want to pass default value, it will return null*/
                },
                navArgument(DETAIL_ARGUMENT_KEY2){
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