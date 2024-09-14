package com.example.test

fun main() {
    calculate(11,200,5)
}

fun calculate(first:Int,second:Int,div:Int) {
    for(i in first..second){
        if(i%div==0){
            println("$i is a multiple of $div")
        }
    }
    println("This is a function")

}
