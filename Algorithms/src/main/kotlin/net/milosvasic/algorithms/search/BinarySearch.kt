package net.milosvasic.algorithms.search

class BinarySearch<in T : Comparable<T>> : Search<T> {

    override fun find(elements: List<T>, criteria: T): Int {
        var low = 1
        var height = elements.size
        while (low <= height) {
            val middle = low + (height - low) / 2
            if (elements[middle] == criteria) {
                return middle
            } else
                if (elements[middle] < criteria) {
                    low = middle + 1
                } else {
                    height = middle - 1
                }
        }
        return -1
    }

}
