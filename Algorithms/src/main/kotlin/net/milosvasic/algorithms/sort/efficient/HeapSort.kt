package net.milosvasic.algorithms.sort.efficient

import net.milosvasic.algorithms.sort.Sort

class HeapSort<T : Comparable<T>> : Sort<T> {

    private var count = 0

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        count = elements.size - 1
        for (index in count / 2 downTo 0) {
            heapify(elements, index, ascending)
        }
        for (index in count downTo 1) {
            swap(elements, 0, index)
            count--
            heapify(elements, 0, ascending)
        }
    }

    private fun heapify(elements: MutableList<T>, index: Int, ascending: Boolean) {
        var max = index
        val left = index * 2
        val right = left + 1
        if (ascending) {
            if (left <= count && elements[left] > elements[max]) {
                max = left
            }
            if (right <= count && elements[right] > elements[max]) {
                max = right
            }
        } else {
            if (left <= count && elements[left] < elements[max]) {
                max = left
            }
            if (right <= count && elements[right] < elements[max]) {
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