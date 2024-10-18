package com.example.advancedkotlin

fun main() {
    val listOfItems = listOf("Atrajit", "Somu", "Hrisav", "Soutam")

    val listOfNumbers= listOf(23,45,69)


//    Throws error
//    val finder1 = Finder(list = listOfNumbers)

    val finder = Finder(list = listOfItems)
    finder.findItem(element = ""){
        println("Found $it")
    }

}

class Finder(private val list: List<String>) {
    fun findItem(element: String, foundItem: (element: String?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}