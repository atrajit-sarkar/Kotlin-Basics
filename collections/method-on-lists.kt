package com.example.test

import org.w3c.dom.Text

fun main() {
    val myListOfNames = listOf("james", "Paul", "Atrajit", "Samaresh")

    val myMutableList = mutableListOf(12, 34, 69)
    myMutableList.add(6969)
    println(myMutableList)
    println("The number of elements ${myMutableList.size}")
    myMutableList.removeAt(0)
    println(myMutableList)
    println("The number of elements ${myMutableList.size}")
    println(myMutableList[0])
    println("Index of element \"69\" is ${myMutableList.indexOf(69)}")

}

