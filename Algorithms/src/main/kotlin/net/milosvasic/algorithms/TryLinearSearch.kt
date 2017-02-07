package net.milosvasic.algorithms

import net.milosvasic.algorithms.search.LinearSearch

fun main(args: Array<String>) {
    // Prepare data
    val totalElements = 100 * 1000
    val randoms = getOrderedData(totalElements)
    val toFind = totalElements / 2

    // Linear search
    val search = LinearSearch<Int>()
    val start = System.currentTimeMillis()
    val result = search.find(randoms, toFind)
    val elapsedTimeResults = getElapsedTime(start)

    // Verify
    if (result != toFind) {
        throw Exception("Search returned wrong value.")
    }

    // Print data
    //    printData(randoms)
    println("Linear search, [ $totalElements ]\nvalue to find: [ $toFind ]\nelapsed time: [ $elapsedTimeResults ]")
    println("----------------------------------------")
}