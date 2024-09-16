package com.example.test

import org.w3c.dom.Text

fun main() {
    val car = Car(color = "Blue", model = "Forza Horizon")
    val secondCar = Car(color = "White", model = "Farari")

    println("Car color:${car.color} and car model:${car.model} and the car ${car.drive()}")

    println("Second car color:${secondCar.color} and Second car model:${secondCar.model} and the Second car ${secondCar.drive()}")
}


class Car(var color: String, var model: String) {


    init {
        if (color == "Green") {
            println("Yayy Green")
        } else {
            println("$color is not Green")
        }

    }

    fun drive(): String {
        return "Drive......yroooommm"
    }

}
