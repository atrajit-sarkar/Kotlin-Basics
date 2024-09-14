package com.example.test

fun main() {
    println(add(1, 2))
    val sum = test("Hey here is the sum is ", 1, 2)
    print(sum)
}

//Lambda Expression:
//val lambdaName: Type = { parameterList -> codeBody }

val add: (Int, Int) -> Int = { a, b -> a + b }

fun sum(a: Int, b: Int): Int {
    return a + b
}

val test: (String, Int, Int) -> Int = { text, a, b ->
    print(text)
    a + b
}