package net.milosvasic.algorithms

import net.milosvasic.algorithms.misc.Inversions

fun main(args: Array<String>) {
    val data = getRandomData(10, 1, 10)

    val inversions = Inversions<Int>()
    val results = inversions.get(data)

    println("We got ${results.size} inversions.")
}
