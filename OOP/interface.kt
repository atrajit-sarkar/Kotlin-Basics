package com.example.test

import org.w3c.dom.Text

fun main() {

    val button = Button(label = "Button")
    button.onClick(message = "This is a button")

    val superMArio = Character(name = "SuperMArio")
    superMArio.onClick(message = "This is an Actor")
}


class Button(val label: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's a message $message")
    }

}

class Character(private val name: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's a message $message")
    }

}

//Interface
interface ClickEvent {
    fun onClick(message: String)
}
