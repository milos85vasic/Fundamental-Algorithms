package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.InsertionSort

fun main(args: Array<String>) {

    println("Insertion sort:")
    // Try some random data
    val randoms = getRandomData(10)
    val ascending = randoms.clone()
    val descending = randoms.clone()
    // Do insert sort
    InsertionSort<Int>().sort(ascending)
    InsertionSort<Int>().sort(descending, false)
    printData(randoms, ascending, descending)

}
