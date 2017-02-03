package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.MergeSort


fun main(args: Array<String>) {
    // Prepare data
    val randoms = getRandomData(10, 0, 10)
    val ascending = randoms.clone()
    val descending = randoms.clone()

    // Sort ascending
    var start = System.currentTimeMillis()
    MergeSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
//    start = System.currentTimeMillis()
//    MergeSort<Int>().sort(descending, false)
//    val elapsedDescending = getElapsedTime(start)

    // Print data
    println("Merge sort:")
    printData(randoms, ascending, descending)
    println("Merge sort ascending, elapsed time: [ $elapsedAscending ]")
//    println("Merge sort descending, elapsed time: [ $elapsedDescending ]")
}