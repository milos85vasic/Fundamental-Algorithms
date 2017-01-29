package net.milosvasic.algorithms.sort

class InsertionSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: Array<T>, ascending: Boolean) {
        for (x in 1..elements.size - 1) {
            val key = elements[x]
            var y = x - 1
            val condition = if (ascending) {
                elements[y] > key
            } else {
                elements[y] < key
            }
            while (y >= 0 && condition) {
                elements[y + 1] = elements[y]
                y--
            }
            elements[y + 1] = key
        }
    }

}