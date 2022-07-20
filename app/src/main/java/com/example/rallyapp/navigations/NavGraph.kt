package com.example.rallyapp.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.rallyapp.appscreens.*

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screens.Splash.route){
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
        composable(
            route = Screens.SignUp.route
        ){
            Register(navController = navController)
        }
        composable(
            route = Screens.Login.route
        ){
            Login(navController = navController)
        }
        composable(
            route = Screens.Splash.route
        ){
            Splash(navController = navController)
        }
        composable(
            route = Screens.Profile.route
        ){
            TopBar(navController = navController)
        }
    }

}