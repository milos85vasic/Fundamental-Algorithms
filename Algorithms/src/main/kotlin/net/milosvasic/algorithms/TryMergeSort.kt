package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.MergeSort


fun main(args: Array<String>) {
    // "Prepare data"
    val ascendingRaw = getRandomData(1000 * 1000, 1, 1000)
    val descendingRaw = getRandomData(1000 * 1000, 1, 1000)

    // "Sort ascending"
    var start = System.currentTimeMillis()
    MergeSort<Int>().sort(ascendingRaw)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
    start = System.currentTimeMillis()
    MergeSort<Int>().sort(descendingRaw, false)
    val elapsedDescending = getElapsedTime(start)

    // Verify sorting
    verify(ascendingRaw)
    verify(descendingRaw, false)

    // Print data
    println("Merge sort ascending, elapsed time: [ $elapsedAscending ]")
    println("Merge sort descending, elapsed time: [ $elapsedDescending ]")
}