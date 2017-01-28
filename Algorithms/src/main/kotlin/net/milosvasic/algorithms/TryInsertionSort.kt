package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.InsertionSort

fun main(args: Array<String>) {

    println("Insertion sort:")
    // Try some random data
    val randoms = getRandomData(10)
    val sorted = randoms.clone()
    // Do insert sort
    InsertionSort<Int>().sort(sorted)
    printData(randoms, sorted)

}
