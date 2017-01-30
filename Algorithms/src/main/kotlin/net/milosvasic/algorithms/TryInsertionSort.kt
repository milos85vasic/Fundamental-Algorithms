package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.InsertionSort

fun main(args: Array<String>) {
    // Prepare data
    val randoms = getRandomData(1000, 0, 1000)
    val ascending = randoms.clone()
    val descending = randoms.clone()

    // Sort ascending
    var start = System.currentTimeMillis()
    InsertionSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
    start = System.currentTimeMillis()
    InsertionSort<Int>().sort(descending, false)
    val elapsedDescending = getElapsedTime(start)

    // Print data
    println("Insert sort:")
    printData(randoms, ascending, descending)
    println("Insert sort ascending, elapsed time: [ $elapsedAscending ]")
    println("Insert sort descending, elapsed time: [ $elapsedDescending ]")
}
