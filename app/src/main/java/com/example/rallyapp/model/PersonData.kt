package com.example.rallyapp.model

data class PersonData(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val imageId: Int = 0
)
