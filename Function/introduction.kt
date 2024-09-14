package com.example.test

fun main() {
    sayHello()
}

fun sayHello() {
    for(i in 1..100){
        if(i%2==0){
            println("$i is a multiple of 2")
        }
    }
    println("This is a function")

}
