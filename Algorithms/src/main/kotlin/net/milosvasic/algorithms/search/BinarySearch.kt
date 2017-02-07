package net.milosvasic.algorithms.search

import net.milosvasic.algorithms.sort.MergeSort

class BinarySearch<in T : Comparable<T>> : Search<T> {

    private val sort = MergeSort<T>()

    override fun find(elements: List<T>, criteria: T): Int {
        val elementsCopy = mutableListOf<T>()
        elementsCopy.addAll(elements)
        sort.sort(elementsCopy)
        var low = 1
        var height = elementsCopy.size
        while (low <= height) {
            val middle = low + (height - low) / 2
            if (elementsCopy[middle] == criteria) {
                return middle
            } else
                if (elementsCopy[middle] < criteria) {
                    low = middle + 1
                } else {
                    height = middle - 1
                }
        }
        return -1
    }

}
