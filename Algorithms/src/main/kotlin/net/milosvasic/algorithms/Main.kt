package net.milosvasic.algorithms

import java.util.concurrent.ThreadLocalRandom


fun getRandomData(count: Int): Array<Int> {
    val items = Array(count, { i -> 0 })
    for (x in 0..count - 1) {
        items[x] = ThreadLocalRandom.current().nextInt(0, count)
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
