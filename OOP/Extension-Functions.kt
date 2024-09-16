package com.example.test

import org.w3c.dom.Text

fun main() {

    println("Hello Jenny ".append("Miss :)"))
}

fun String.append(toAppend: String): String {
    return this.plus(toAppend)
}
