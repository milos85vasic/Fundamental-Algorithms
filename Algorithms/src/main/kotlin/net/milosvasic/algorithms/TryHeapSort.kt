package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.efficient.HeapSort
import net.milosvasic.algorithms.sort.simple.InsertionSort

fun main(args: Array<String>) {
    // Prepare data
    val randoms = getRandomData(1000, 0, 1000)
    val ascending = mutableListOf<Int>()
//    val descending = mutableListOf<Int>()
    ascending.addAll(randoms)
//    descending.addAll(randoms)

    // Sort ascending
    val start = System.currentTimeMillis()
    HeapSort<Int>().sort(ascending)
    val elapsedAscending = getElapsedTime(start)

    // Sort descending
//    start = System.currentTimeMillis()
//    InsertionSort<Int>().sort(descending, false)
//    val elapsedDescending = getElapsedTime(start)

    // Verify sorting
    verify(ascending)
//    verify(descending, false)

    // Print data
    println("Heap sort:")
//    printData(randoms, ascending, descending)
    printData(randoms, ascending)
    println("Heap sort ascending, elapsed time: [ $elapsedAscending ]")
//    println("Heap sort descending, elapsed time: [ $elapsedDescending ]")
}
