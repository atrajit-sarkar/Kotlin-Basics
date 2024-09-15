package com.example.test

import org.w3c.dom.Text

fun main() {

    val myListOfNames = listOf("Atrajit", "Nobita", "Soutam", "Tukun", "Aritra")

    val found = myListOfNames.filter {
        it == "Atrajit01"

    }

    val found1 = myListOfNames.filter {
        it.length > 4

    }

    val found2 = myListOfNames.filter {
        it.startsWith("a", ignoreCase = true) || it.endsWith("a", ignoreCase = true)

    }
    println(found)
    println(found1)
    println(found2)

}

