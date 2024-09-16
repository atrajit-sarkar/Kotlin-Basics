package com.example.test

import org.w3c.dom.Text

fun main() {
    val car=Car()
    car.color="Blue"
    car.model="Suzume"
    
    println(car.color)
    println(car.model)
    println(car.drive())
}

    class Car{
        var color:String="Red"
        var model:String="XMD"

        fun drive(){
            println("Drive......yroooommm")
        }

    }
