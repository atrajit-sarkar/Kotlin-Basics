package com.example.test

import org.w3c.dom.Text

fun main() {
    val car = Car(color = "Blue", model = "Forza Horizon")
    val secondCar = Car(color = "White", model = "Farari")
    car.speed(minSpeed = 123, maxSpeed = 699)

    println("Car color:${car.color} and car model:${car.model} and the car ${car.drive()}")

    println("Second car color:${secondCar.color} and Second car model:${secondCar.model} and the Second car ${secondCar.drive()}")

    //Truck
    val truck = Truck(color = "Magenta", model = "F16")
    println("The truck is ${truck.drive()}")

    truck.speed(minSpeed = 20, maxSpeed = 90)
}


class Truck(color: String, model: String) : Car(color, model) {
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println("Truck full speed $fullSpeed")
    }

    override fun drive(): String {
        return "Yroom.....Like a truck"
    }
}

open class Car(
    var color: String,
    var model: String
) {


    init {
        if (color == "Green") {
            println("Yayy Green")
        } else {
            println("$color is not Green")
        }

    }

    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and max speed is $maxSpeed")
    }

    open fun drive(): String {
        return "Drive......yroooommm"
    }

}
