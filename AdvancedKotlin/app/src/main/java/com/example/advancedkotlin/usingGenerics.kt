package com.example.advancedkotlin


fun main() {
    val listOfItems = listOf("Atrajit", "Somu", "Hrisav", "Soutam")

    val listOfNumbers= listOf(23,45,69)


//    Throws doesn't error
    val finder1 = Finder1(list = listOfNumbers)

    val finder = Finder1(list = listOfItems)
    finder1.findItem(element = 233){
        println("Found $it")
    }

}

class Finder1<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}