package com.example.test

import org.w3c.dom.Text

fun main() {
    //Initialising Empty Mutable List
    val myNewList = mutableListOf<String>()
    val myNewListInt = mutableListOf<Int>()
    myNewList.add("Hey")
    myNewList.add("There")
    for (i in 1..10) {
        myNewList.add(i - 1, "Hey$i")
    }

    println(myNewList)


}

