package com.example.rallyapp.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.rallyapp.appscreens.DetailScreen
import com.example.rallyapp.appscreens.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screens.Home.route){
        composable(
            route = Screens.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screens.Details.route
        ){
            DetailScreen(navController = navController)
        }
    }

}