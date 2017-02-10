package net.milosvasic.algorithms.sort.simple

import net.milosvasic.algorithms.sort.Sort

class InsertionSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        for (x in 1..elements.size - 1) {
            val key = elements[x]
            var y = x - 1
            if (ascending) {
                while (y >= 0 && elements[y] > key) {
                    elements[y + 1] = elements[y]
                    y--
                }
            } else {
                while (y >= 0 && elements[y] < key) {
                    elements[y + 1] = elements[y]
                    y--
                }
            }
            elements[y + 1] = key
        }
    }

}