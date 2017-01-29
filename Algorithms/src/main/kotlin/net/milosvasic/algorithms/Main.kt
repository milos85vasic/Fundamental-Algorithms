package net.milosvasic.algorithms

import java.util.concurrent.ThreadLocalRandom


fun getRandomData(count: Int): Array<Int> {
    val items = Array(count, { i -> -1 })
    for (x in 0..count - 1) {
        var item = ThreadLocalRandom.current().nextInt(0, count)
        while (items.contains(item)) {
            item = ThreadLocalRandom.current().nextInt(0, count)
        }
        items[x] = item
    }
    return items
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
