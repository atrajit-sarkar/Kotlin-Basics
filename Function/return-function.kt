package com.example.test

fun main() {
//    println(calculateCatAge(7))
    val catAge = calculateCatAge(age = 12) 
    println("This cat is $catAge years old.")
}

//fun calculateCatAge(age: Int): Int {
//    val catAge = age * 7
//    return catAge
//}

fun calculateCatAge(age: Int): Int = age * 7

