package net.milosvasic.algorithms

import net.milosvasic.algorithms.sort.InsertionSort

fun main(args: Array<String>) {

    println("Trying some algorithms.")
    // Try some random data
    val randoms = getRandomData(10)
    printData(randoms)
    // Do insert sort
    val sorted = InsertionSort<Int>().sort(randoms)
    printData(randoms, sorted)

}
