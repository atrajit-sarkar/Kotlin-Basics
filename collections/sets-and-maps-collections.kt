package com.example.test

import org.w3c.dom.Text

fun main() {
    val myMutableList = mutableListOf(12, 34, 69)
    myMutableList.add(12)
    println(myMutableList)

    //Set
    val mySet = setOf("US", "MZ", "AU")
    val myMutableSet = mutableSetOf(1, 2, 3, 4, 5)
    myMutableSet.add(69)
    myMutableSet.add(3)
    println(myMutableSet)

    //Map
    val secretMap= mapOf("Up" to 1,"Down" to 2,"Left" to 3,"Right" to 4)
    println(secretMap.values)
    if ("Up" in secretMap) println("Yes is in!")
    if (4 in secretMap.values) println("yes is in!")

    val myMutableMap= mutableMapOf("one" to 1,"two" to 2,"three" to 3)

    myMutableMap["Four"]=4
    println(myMutableMap)
    println(myMutableMap["one"])

}

