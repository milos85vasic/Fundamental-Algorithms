package net.milosvasic.algorithms.sort.efficient

import net.milosvasic.algorithms.sort.Sort

class HeapSort<T : Comparable<T>> : Sort<T> {

    private var total = 0

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        total = elements.size - 1
        for (index in total / 2 downTo 0) {
            heapify(elements, index, ascending)
        }
        for (index in total downTo 1) {
            swap(elements, 0, index)
            total--
            heapify(elements, 0, ascending)
        }
    }

    private fun heapify(elements: MutableList<T>, index: Int, ascending: Boolean) {
        var max = index
        val left = index * 2
        val right = left + 1
        if (ascending) {
            if (left <= total && elements[left] > elements[max]) {
                max = left
            }
            if (right <= total && elements[right] > elements[max]) {
                max = right
            }
        } else {
            if (left <= total && elements[left] < elements[max]) {
                max = left
            }
            if (right <= total && elements[right] < elements[max]) {
                max = right
            }
        }
        if (max != index) {
            swap(elements, index, max)
            heapify(elements, max, ascending)
        }
    }

    private fun swap(elements: MutableList<T>, a: Int, b: Int) {
        val tmp = elements[a]
        elements[a] = elements[b]
        elements[b] = tmp
    }

}