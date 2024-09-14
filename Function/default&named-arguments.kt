package com.example.test

fun main() {
//    calculate(11, 200, message = "is multiple of",5)
    calculate(
        message = "is multile of",
        div = 10
    )
}

fun calculate(
    first: Int = 11,
    second: Int = 100,
    message: String,
    div: Int
) {
    for (i in first..second) {
        if (i % div == 0) {
            println("$i $message $div")
        }
    }
    println("This is a function")

}
