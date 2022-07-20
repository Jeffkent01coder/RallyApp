package com.example.rallyapp.appscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.rallyapp.customsDesing.CustomItem
import com.example.rallyapp.model.PersonRepository
import com.example.rallyapp.navigations.Screens
import com.example.rallyapp.ui.theme.RallyAppTheme

@Composable
fun DetailScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .clip(shape = CircleShape)
                .padding(8.dp)
                .background(Color.Cyan)
                .padding(horizontal = 12.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screens.Home.route)
                },
                imageVector = Icons.Default.Home,
                contentDescription = "Home"
            )

            Text(
                text = "Details",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
        val personRepository = PersonRepository()
        val getAllData = personRepository.getAllData()

        LazyColumn(
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            items(items = getAllData){person ->
                CustomItem(personData = person )
            }
        }

    }

}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPrev() {
    RallyAppTheme {
        DetailScreen(navController = rememberNavController())
    }
}

