package com.example.rallyapp.navigations

sealed class Screens(val route: String){
    object Home: Screens(route = "home_screen")
    object Details: Screens(route = "detail_screen")
    object Login: Screens(route = "home_Screen")
    object SignUp: Screens(route = "signup_Screen")
    object Splash: Screens(route = "splash_Screen")
    object Profile: Screens(route = "Profile_Screen")
}
