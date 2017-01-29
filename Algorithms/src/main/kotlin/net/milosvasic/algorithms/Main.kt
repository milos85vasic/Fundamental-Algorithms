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

fun printData(data: Array<Int>, sorted: Array<Int>) {
    for (x in 0..data.size - 1) {
        println("${data[x]} ${sorted[x]}")
    }
}
