package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.simple.SelectionSort

fun main(args: Array<String>) {
    // Prepare data
    val randoms = getRandomData(1000, 0, 1000)
    val ascending = mutableListOf<Int>()
    val descending = mutableListOf<Int>()
    ascending.addAll(randoms)
    descending.addAll(randoms)

    // Sort ascending
    var start = System.currentTimeMillis()
    SelectionSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
    start = System.currentTimeMillis()
    SelectionSort<Int>().sort(descending, false)
    val elapsedDescending = getElapsedTime(start)

    // Verify sorting
    verify(ascending)
    verify(descending, false)

    // Print data
    println("Selection sort:")
    printData(randoms, ascending, descending)
    println("Selection sort ascending, elapsed time: [ $elapsedAscending ]")
    println("Selection sort descending, elapsed time: [ $elapsedDescending ]")
}
