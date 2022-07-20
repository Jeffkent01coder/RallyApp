package com.example.rallyapp.appscreens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.rallyapp.R
import com.example.rallyapp.navigations.Screens
import com.example.rallyapp.ui.theme.DeepBlue
import com.example.rallyapp.ui.theme.RallyAppTheme
import com.example.rallyapp.ui.theme.TextWhite
import kotlinx.coroutines.delay

@Composable
fun Splash(
    navController: NavController
) {
    val scale = remember{
       Animatable(0f)
    }
    LaunchedEffect(key1 = true){
        scale.animateTo(
            targetValue = 0.3f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(3000L)
        navController.navigate(route = Screens.Home.route)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(DeepBlue)
    )
    {
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .padding(50.dp),
            painter = painterResource(id = R.drawable.jj),
            contentDescription = "Logo"
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            modifier = Modifier.padding(top = 500.dp),
            text = "Welcome to the Rally",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            color = TextWhite
        )

    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPrev() {
    RallyAppTheme {
        Splash(navController = rememberNavController())
    }
}