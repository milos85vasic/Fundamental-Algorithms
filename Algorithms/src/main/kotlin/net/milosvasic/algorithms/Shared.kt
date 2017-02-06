package net.milosvasic.algorithms

import java.util.concurrent.ThreadLocalRandom

fun getRandomData(count: Int, min: Int, max: Int): MutableList<Int> {
    val items = mutableListOf<Int>()
    for (x in 0..count - 1) {
        items.add(getRandomNumber(min, max))
    }
    return items
}

fun getOrderedData(count: Int, ascending: Boolean = true): MutableList<Int> {
    val items = mutableListOf<Int>()
    if (ascending) {
        items.addAll(Array(count, { i -> i + 1 }))
    } else {
        items.addAll(Array(count, { i -> count - i }))
    }
    return items
}

fun printData(data: List<Int>) {
    for (x in data) {
        println(x)
    }
}

fun printData(vararg data: List<Int>) {
    var lastSize = -1
    for (item in data) {
        if (item.size > lastSize) {
            lastSize = item.size
        }
    }
    for (x in 0..lastSize - 1) {
        val line = StringBuilder()
        for (item in data) {
            if (x < item.size) {
                line.append("[${item[x]}] ")
            }
        }
        println(line.toString())
    }
}

fun getElapsedTime(started: Long): Long {
    return System.currentTimeMillis() - started
}

fun getRandomNumber(min: Int, max: Int) = ThreadLocalRandom.current().nextInt(min, max)

fun verify(elements: MutableList<Int>, ascending: Boolean = true) {
    for (x in 0..elements.lastIndex) {
        if (x > 0) {
            if (ascending) {
                if (elements[x] < elements[x - 1]) {
                    throw Exception("Sorting algorithm does not sort properly!")
                }
            } else {
                if (elements[x] > elements[x - 1]) {
                    throw Exception("Sorting algorithm does not sort properly!")
                }
            }
        }
    }
}
