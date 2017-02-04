package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.MergeSort


fun main(args: Array<String>) {
    // Prepare data
    val ascendingRaw = mutableListOf<Int>()
    val descendingRaw = mutableListOf<Int>()
    val ascending = mutableListOf<Int>()
    val descending = mutableListOf<Int>()
    ascendingRaw.addAll(getListOrderedData(15, false))
    descendingRaw.addAll(getListOrderedData(15, true))
    ascending.addAll(ascendingRaw)
    descending.addAll(descendingRaw)

    // Sort ascending
    var start = System.currentTimeMillis()
    MergeSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
    start = System.currentTimeMillis()
    MergeSort<Int>().sort(descending, false)
    val elapsedDescending = getElapsedTime(start)

    // Print data
    println("Merge sort:")
    printListData(ascendingRaw, ascending, descendingRaw, descending)
    println("Merge sort ascending, elapsed time: [ $elapsedAscending ]")
    println("Merge sort descending, elapsed time: [ $elapsedDescending ]")
}