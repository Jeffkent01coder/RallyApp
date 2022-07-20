package com.example.rallyapp.customsDesing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rallyapp.model.PersonData
import com.example.rallyapp.ui.theme.BlueViolet1
import com.example.rallyapp.ui.theme.BlueViolet3
import com.example.rallyapp.ui.theme.TextWhite


@Composable
fun CustomItem(
    personData: PersonData
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(7.dp))
            .background(BlueViolet3)
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Image(
            painter = painterResource(
                id = personData.imageId
            ), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Text(
            text = personData.firstName,
            color = TextWhite,
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = personData.lastName,
            color = TextWhite,
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${personData.age}",
            color = TextWhite,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )

    }

}


