package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.MergeSort


fun main(args: Array<String>) {

    // "Prepare data"
    val ascendingRaw = mutableListOf<Int>()
    val descendingRaw = mutableListOf<Int>()
    val ascending = mutableListOf<Int>()
    val descending = mutableListOf<Int>()
    ascendingRaw.addAll(getRandomData(1000, 1, 1000))
    descendingRaw.addAll(ascendingRaw)
    ascending.addAll(ascendingRaw)
    descending.addAll(descendingRaw)

    // "Sort ascending"
    var start = System.currentTimeMillis()
    MergeSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
    start = System.currentTimeMillis()
    MergeSort<Int>().sort(descending, false)
    val elapsedDescending = getElapsedTime(start)

    // Verify sorting
    verify(ascending)
    verify(descending, false)

    // Print data
    println("Merge sort:")
    printData(ascendingRaw, ascending, descendingRaw, descending)
    println("Merge sort ascending, elapsed time: [ $elapsedAscending ]")
    println("Merge sort descending, elapsed time: [ $elapsedDescending ]")
}