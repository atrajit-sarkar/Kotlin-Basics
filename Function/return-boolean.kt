package com.example.test

fun main() {
//    println(calculateCatAge(7))
    val catAge = calculateCatAge(age = 1)
    if (checkage(catAge)) {
        println("This cat is $catAge years old.")

    }else{
        println("This cat is young!")
    }
//    println(checkage(catAge))
}

//fun calculateCatAge(age: Int): Int {
//    val catAge = age * 7
//    return catAge
//}

fun calculateCatAge(age: Int): Int = age * 7

fun checkage(catAge: Int): Boolean {
    return catAge > 14
}