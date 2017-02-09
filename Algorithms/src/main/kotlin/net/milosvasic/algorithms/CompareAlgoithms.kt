package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.*
import java.util.*

fun main(args: Array<String>) {
    // Define amounts of data to be sorted by algorithm
    val smallData = listOf(1, 10, 100, 1000, 10 * 1000, 100 * 1000)
    val bigData = listOf(1, 10, 100, 1000, 10 * 1000, 100 * 1000, 1000 * 1000, 10 * 1000 * 1000)

    // Test data cache
    val cache = HashMap<Int, List<Int>>()

    // Define algorithms to test and data amounts to use in testing
    val algorithms = LinkedHashMap<Sort<Int>, List<Int>>()
    algorithms.put(InsertionSort<Int>(), smallData)
    algorithms.put(BinaryInsertionSort<Int>(), smallData)
    algorithms.put(SelectionSort<Int>(), smallData)
    algorithms.put(MergeSort<Int>(), bigData)

    // Test algorithms
    for ((algorithm, tests) in algorithms) {
        for (count in tests) {
            // Obtain test data
            var data: List<Int>? = cache[count]
            if (data == null) {
                //                data = getOrderedData(count, false)
                data = getRandomData(count, 10, 50)
                cache.put(count, data) // Sort descending data to ascending
            }

            val ascending = mutableListOf<Int>()
            ascending.addAll(data)

            // Sort ascending
            val start = System.currentTimeMillis()
            algorithm.sort(ascending)
            val elapsedAscending = getElapsedTime(start)

            // Verify sorting
            verify(ascending)

            // Print results
            val name = algorithm.javaClass.simpleName
            println("[ $name ] [ items count: ${ascending.size} ][ elapsed time: $elapsedAscending ]")
        }
        println("- - - - - - - - - - - - - - - ")
    }
}