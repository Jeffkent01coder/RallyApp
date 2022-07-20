package com.example.rallyapp.model

import com.example.rallyapp.R

class PersonRepository {
    fun getAllData(): List<PersonData>{
        return listOf(
            PersonData(
                id = 0,
                firstName = "Moris",
                lastName = "Burke",
                age = 21,
                imageId = R.drawable.jj
            ),
            PersonData(
                id = 1,
                firstName = "Sean",
                lastName = "Leaky",
                age = 20,
                imageId = R.drawable.nfs
            ),
            PersonData(
                id = 2,
                firstName = "Liam",
                lastName = "Richard",
                age = 22,
                imageId = R.drawable.pu
            ),
            PersonData(
                id = 3,
                firstName = "Peter",
                lastName = "Onfroy",
                age = 20,
                imageId = R.drawable.qq
            ),
            PersonData(
                id = 4,
                firstName = "Isa",
                lastName = "Kent",
                age = 21,
                imageId = R.drawable.m
            ),
            PersonData(
                id = 5,
                firstName = "Jeff",
                lastName = "Leaky",
                age = 20,
                imageId = R.drawable.n
            ),
            PersonData(
                id = 6,
                firstName = "Imelda",
                lastName = "Leaky",
                age = 21,
                imageId = R.drawable.a7
            ),
            PersonData(
                id = 7,
                firstName = "David",
                lastName = "Ony",
                age = 22,
                imageId = R.drawable.b1
            ),
            PersonData(
                id = 8,
                firstName = "Jesica",
                lastName = "Onfroy",
                age = 19,
                imageId = R.drawable.c1
            ),
            PersonData(
                id = 9,
                firstName = "iwom",
                lastName = "fsnsk",
                age = 20,
                imageId = R.drawable.s
            ),
            PersonData(
                id = 1,
                firstName = "Kaent",
                lastName = "Sdayh",
                age = 21,
                imageId = R.drawable.jj
            )
        )
    }
}