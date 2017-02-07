package net.milosvasic.algorithms

import net.milosvasic.algorithms.search.BinarySearch
import net.milosvasic.algorithms.search.LinearSearch
import net.milosvasic.algorithms.search.Search
import java.util.*

fun main(args: Array<String>) {
    // Define amounts of data to be sorted by algorithm
    val testData = listOf(100, 1000, 10 * 1000, 100 * 1000, 1000 * 1000, 10 * 1000 * 1000)

    // Test data cache
    val cache = HashMap<Int, List<Int>>()

    // Define algorithms to test and data amounts to use in testing
    val algorithms = LinkedHashMap<Search<Int>, List<Int>>()
    algorithms.put(LinearSearch<Int>(), testData)
    algorithms.put(BinarySearch<Int>(), testData)

    // Test algorithms
    for ((algorithm, tests) in algorithms) {
        for (count in tests) {
            // Obtain test data
            var data: List<Int>? = cache[count]
            if (data == null) {
                data = getOrderedData(count, true)
                cache.put(count, data)
            }

            // Choose random member from existing test data to be found
            val toFind = data[3 * (data.lastIndex / 4)]

            // Sort ascending
            val start = System.currentTimeMillis()
            val result = algorithm.find(data, toFind)
            val elapsedAscending = getElapsedTime(start)

            // Verify sorting
            if (result < 0) {
                throw Exception("Search failed.")
            }

            // Print results
            val name = algorithm.javaClass.simpleName
            println("[ $name ] [ items count: ${data.size} ][ elapsed time: $elapsedAscending ][ searching for: $toFind ][ found at: $result ]")
        }
        println("- - - - - - - - - - - - - - - ")
    }
}
