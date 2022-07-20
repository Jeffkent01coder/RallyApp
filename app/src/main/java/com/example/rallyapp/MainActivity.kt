package com.example.rallyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rallyapp.appscreens.Splash
import com.example.rallyapp.navigations.SetupNavGraph
import com.example.rallyapp.ui.theme.RallyAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RallyAppTheme {
               navController = rememberNavController()
                SetupNavGraph(navController = navController)
                Splash(navController = navController)
            }
        }
    }
}


