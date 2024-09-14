package com.example.test

fun main() {
    println(catAge(7))
}

val catAge: (Int) -> Int = {it * 7 }