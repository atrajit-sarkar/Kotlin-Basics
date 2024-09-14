package com.example.test

fun main() {
    name("Atrajit")
}

fun showName(name: String) {
    println(name("Atrajit"))
}

val name: (String) -> Unit = {
    println(it)
}