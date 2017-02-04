package net.milosvasic.algorithms.sort

import java.util.*


class MergeSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: Array<T>, ascending: Boolean) {
        mergeSort(elements)
    }

    private fun mergeSort(elements: Array<T>) {
        val size = elements.size
        if (size > 1) {
            val middle = size / 2
            val first = Arrays.copyOfRange(elements, 0, middle - 1)
            val second = Arrays.copyOfRange(elements, middle, size - 1)
            mergeSort(first)
            mergeSort(second)
            merge(first, second)
        }
    }

    private fun merge(first: Array<T>, second: Array<T>) {

    }

}