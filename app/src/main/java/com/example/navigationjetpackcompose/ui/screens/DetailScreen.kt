package com.example.navigationjetpackcompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpackcompose.Screen


@Composable
fun DetailScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
//                navController.popBackStack()
                navController.navigate(route = Screen.Home.route) {
                    popUpTo(Screen.Home.route) {
                        inclusive = true
                    }
                }

            },
            text = "Detail",
            style = TextStyle(
                color = Color.Red,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(navController = rememberNavController())
}