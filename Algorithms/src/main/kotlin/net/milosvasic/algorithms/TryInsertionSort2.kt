package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.simple.InsertionSort

fun main(args: Array<String>) {
    for (x in listOf(1, 10, 100, 1000, 10 * 1000, 100 * 1000, 1000 * 1000)) {
        val data = getOrderedData(x, false) // Worst time consuming case for sorting!
        val ascending = mutableListOf<Int>()
        ascending.addAll(data)

        // Sort ascending
        val start = System.currentTimeMillis()
        InsertionSort<Int>().sort(ascending)
        val elapsedAscending = getElapsedTime(start)

        // Print data
        // printData(data, ascending)
        println("Insert sort [ items count: $x ][ elapsed time: $elapsedAscending ]")
    }
}