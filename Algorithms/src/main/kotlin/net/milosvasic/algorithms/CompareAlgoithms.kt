package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.InsertionSort
import net.milosvasic.algorithms.sort.SelectionSort

fun main(args: Array<String>) {
    val tests = listOf(1, 10, 100, 1000, 10 * 1000, 100 * 1000)
    val algorithms = listOf(InsertionSort<Int>(), SelectionSort<Int>())
    for (algorithm in algorithms) {
        for (count in tests) {
            val data = getOrderedData(count, false) // Worst time consuming case for sorting!
            val ascending = mutableListOf<Int>()
            ascending.addAll(data)

            // Sort ascending
            val start = System.currentTimeMillis()
            SelectionSort<Int>().sort(ascending)
            val elapsedAscending = getElapsedTime(start)

            // Print data
            // printData(data, ascending)
            val name = algorithm.javaClass.simpleName
            println("[ $name ] [ items count: $count ][ elapsed time: $elapsedAscending ]")
        }
        println("- - - - - - - - - - - - - - - ")
    }
}