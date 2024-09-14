package com.example.test

fun main() {
    enhancedMessage(message = "hello there,") {
        println(it)
        add(12, 12)
    }
}

val add: (Int, Int) -> Int = { a, b -> a + b }

fun enhancedMessage(message: String, funAsParameter: (String) -> Int) {
    println("$message ${funAsParameter("Hey")}")
}