package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.BinaryInsertionSort
import net.milosvasic.algorithms.sort.InsertionSort

fun main(args: Array<String>) {
    // Prepare data
    val randoms = getRandomData(1000, 0, 1000)
    val ascending = mutableListOf<Int>()
    val descending = mutableListOf<Int>()
    ascending.addAll(randoms)
    descending.addAll(randoms)

    // Sort ascending
    var start = System.currentTimeMillis()
    BinaryInsertionSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
    start = System.currentTimeMillis()
    InsertionSort<Int>().sort(descending, false)
    val elapsedDescending = getElapsedTime(start)

    // Verify sorting
    verify(ascending)
    verify(descending, false)

    // Print data
    println("Binary insert sort:")
    printData(randoms, ascending, descending)
    println("Binary insert sort ascending, elapsed time: [ $elapsedAscending ]")
    println("Binary insert sort descending, elapsed time: [ $elapsedDescending ]")
}