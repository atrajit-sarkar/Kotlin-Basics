package com.example.test

fun main() {
    val amount=1000
//    if(amount==1000){
//        println("You are Wealthy")
//
//    }else if (amount>=1000){
//        println("Wow!You are too wealthy")
//    }
//    else{
//        println("you are ot wealthy")
//    }
//    // Difference between "if else-if else" branching vs "if if else" branching
//
//    if(amount==1000){
//        println("You are Wealthy")
//
//    }
//
//    if (amount>=1000){
//        println("Wow!You are too wealthy")
//    }
//    else{
//        println("you are ot wealthy")
//    }

    when(amount){
       1000-> println("You have $amount")
       200-> println("You have $amount")
       300-> println("You have $amount")
    }
}

