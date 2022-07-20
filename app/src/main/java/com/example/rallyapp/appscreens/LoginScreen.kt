package com.example.rallyapp.appscreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.rallyapp.R
import com.example.rallyapp.navigations.Screens
import com.example.rallyapp.ui.theme.RallyAppTheme

@Composable
fun Login(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .background(Cyan)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .padding(horizontal = 12.dp, vertical = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screens.SignUp.route)
                },
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back arrow"
            )

            Text(
                text = "Login",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Image(
            painter = painterResource(
                id = R.drawable.login
            ),
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp)
                .padding(vertical = 12.dp)
        )


        var inputEmail by remember { mutableStateOf("") }
        var passwordInput by remember { mutableStateOf("") }
        var isPasswordVisible by remember { mutableStateOf(false) }


        OutlinedTextField(
            value = inputEmail,
            onValueChange = { newValue ->
                inputEmail = newValue
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 12.dp),
            label = {
                Text(text = "Email")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "email_icon")
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { newValue ->
                passwordInput = newValue
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 12.dp),
            label = {
                Text(text = "PassWord")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "Icon")
            },
            trailingIcon = {
                val image = if (isPasswordVisible)
                    R.drawable.ic_baseline_visibility_24 else R.drawable.ic_baseline_visibility_off_24
                IconButton(onClick = {
                    isPasswordVisible = !isPasswordVisible
                }) {
                    Icon(painter = painterResource(id = image), contentDescription = "Toggle Icon")
                }
            },
            singleLine = true,
            visualTransformation = if (isPasswordVisible) VisualTransformation.None
            else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        OutlinedButton(
            onClick = {
                navController.navigate(route = Screens.Home.route)
            },
            modifier = Modifier.padding(horizontal = 150.dp, vertical = 10.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(10.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colors.primary
            )
        ) {
            Text(
                text = "Login"
            )

        }

    }


}

@Preview
@Composable
fun LoginPrev() {
    RallyAppTheme {
        Login(navController = rememberNavController())
    }
}