package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.MergeSort


fun main(args: Array<String>) {
    // Prepare data
    val randoms = getListRandomData(10, 0, 10)
    val ascending = mutableListOf<Int>()
    val descending = mutableListOf<Int>()
    ascending.addAll(randoms)
    descending.addAll(randoms)

    // SortArray ascending
    var start = System.currentTimeMillis()
    MergeSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // SortArray descending
//    start = System.currentTimeMillis()
//    MergeSort<Int>().sort(descending, false)
//    val elapsedDescending = getElapsedTime(start)

    // Print data
    println("Merge sort:")
    printListData(randoms, ascending, descending)
    println("Merge sort ascending, elapsed time: [ $elapsedAscending ]")
//    println("Merge sort descending, elapsed time: [ $elapsedDescending ]")
}