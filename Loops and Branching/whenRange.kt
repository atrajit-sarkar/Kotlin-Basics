package com.example.test

fun main() {
    val amount=10000

    when(amount){
//       1000-> println("You have $amount")
       200-> println("You have $amount")
       300-> println("You have $amount")
        in 1..1000-> println("$amount is in range 1 and 100")
        !in 1..1000-> println("$amount is not in range 1 and 100")
    }
}

