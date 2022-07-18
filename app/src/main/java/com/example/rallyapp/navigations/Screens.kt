package com.example.rallyapp.navigations

sealed class Screens(val route: String){
    object Home: Screens(route = "home_screen")
    object Details: Screens(route = "detail_screen")
}
