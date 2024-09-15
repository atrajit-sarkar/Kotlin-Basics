package com.example.test

import org.w3c.dom.Text

fun main() {
    val myListOfNames= listOf("james","Paul","Atrajit","Samaresh")

    val myMutableList= mutableListOf(12,34,69)
    myMutableList.add(6969)
    println(myMutableList)
    myMutableList.removeAt(0)
    println(myMutableList)
//    println(myListOfNames)

//    myListOfNames.forEach{
//        println(it)
//    }

//    for (item in myListOfNames){
//        println(item)
//    }

}

