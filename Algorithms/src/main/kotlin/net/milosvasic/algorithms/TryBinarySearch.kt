package net.milosvasic.algorithms

import net.milosvasic.algorithms.search.BinarySearch

fun main(args: Array<String>) {
    println("Binary search")

    // Prepare data
    val totalElements = 10 * 1000 * 1000
    val randoms = getRandomData(totalElements, 0, 1000)
    val toFind = getRandomNumber(0, 1000)

    println("We are looking [ $toFind ] in [ ${randoms.size} ] items.")

    // Linear search
    val search = BinarySearch<Int>()
    val start = System.currentTimeMillis()
    val result = search.find(randoms, toFind)
    val elapsedTimeResults = getElapsedTime(start)

    // Verify
    if (result < 0) {
        throw Exception("Search failed.")
    }

    println("Elapsed time: [ $elapsedTimeResults ]\nResult found at index: [ $result ]")
}