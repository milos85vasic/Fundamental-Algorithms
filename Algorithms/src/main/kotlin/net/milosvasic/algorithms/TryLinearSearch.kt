package net.milosvasic.algorithms

import net.milosvasic.algorithms.search.simple.LinearSearch

fun main(args: Array<String>) {
    println("Linear search")

    // Prepare data
    val totalElements = 1000 * 1000
    val randoms = getOrderedData(totalElements)
    val toFind = totalElements / 2

    println("We are looking [ $toFind ] in [ ${randoms.size} ] items.")

    // Linear search
    val search = LinearSearch<Int>()
    val start = System.currentTimeMillis()
    val result = search.find(randoms, toFind)
    val elapsedTimeResults = getElapsedTime(start)

    // Verify
    if (result < 0) {
        throw Exception("Search failed.")
    }

    println("Elapsed time: [ $elapsedTimeResults ]\nResult found at index: [ $result ]")
}