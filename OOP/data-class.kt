package com.example.test

import org.w3c.dom.Text

fun main() {

    val person1 = Person(
        name = "Atrajit1",
        lastName = "Sarkar",
        age = 24
    )

    val person2 = Person(
        name = "Atrajit2",
        lastName = "Sarkar",
        age = 23
    )

    val person3 = Person(
        name = "Atrajit3",
        lastName = "Sarkar",
        age = 22
    )
    val listOfPersons = listOf(person1, person2, person3)

    for (item in listOfPersons) {
        println("Name: ${item.name} ${item.lastName}")
        println("Age: ${item.age}")
    }

}

data class Person(val name: String, val lastName: String, val age: Int)

