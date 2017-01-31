package net.milosvasic.algorithms

import java.util.concurrent.ThreadLocalRandom

fun getRandomData(count: Int, min: Int, max: Int, duplicates: Boolean = false): Array<Int> {
    val items = Array(count, { i -> -1 })
    for (x in 0..count - 1) {
        var item = getRandomNumber(min, max)
        if (!duplicates) {
            while (items.contains(item)) {
                item = getRandomNumber(min, max)
            }
        }
        items[x] = item
    }
    return items
}

fun getOrderedData(count: Int, ascending: Boolean = true): Array<Int> {
    if (ascending) {
        return Array(count, { i -> i })
    }
    return Array(count, { i -> count - i })
}

fun printData(data: Array<Int>) {
    for (x in data) {
        println(x)
    }
}

fun printData(vararg data: Array<Int>) {
    var lastSize = data[0].size
    for (item in data) {
        if (item.size != lastSize) {
            throw IllegalArgumentException("All members must be the same size.")
        } else {
            lastSize = item.size
        }
    }
    for (x in 0..lastSize - 1) {
        val line = StringBuilder()
        for (item in data) {
            line.append("[${item[x]}] ")
        }
        println(line.toString())
    }
}

fun getElapsedTime(started: Long): Long {
    return System.currentTimeMillis() - started
}

fun getRandomNumber(min: Int, max: Int) = ThreadLocalRandom.current().nextInt(min, max)
