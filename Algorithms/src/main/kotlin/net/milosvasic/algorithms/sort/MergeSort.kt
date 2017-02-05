package net.milosvasic.algorithms.sort


class MergeSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        mergeSort(elements, ascending)
    }

    private fun mergeSort(elements: MutableList<T>, ascending: Boolean) {
        val size = elements.size
        if (size < 2)
            return
        val mid = size / 2
        val first = mutableListOf<T>()
        val second = mutableListOf<T>()
        for (i in 0..mid - 1) {
            first.add(elements[i])

        }
        for (i in mid..size - 1) {
            second.add(elements[i])
        }
        mergeSort(first, ascending)
        mergeSort(second, ascending)
        merge(first, second, elements, ascending)
    }

    fun merge(first: MutableList<T>, second: MutableList<T>, elements: MutableList<T>, ascending: Boolean) {
        val firstSize = first.size
        val secondSize = second.size
        var i = 0
        var j = 0
        var k = 0
        while (i < firstSize && j < secondSize) {
            if (ascending) {
                if (first[i] <= second[j]) {
                    elements[k] = first[i]
                    i++
                    k++
                } else {
                    elements[k] = second[j]
                    k++
                    j++
                }
            } else {
                if (first[i] >= second[j]) {
                    elements[k] = first[i]
                    i++
                    k++
                } else {
                    elements[k] = second[j]
                    k++
                    j++
                }
            }
        }
        while (i < firstSize) {
            elements[k] = first[i]
            k++
            i++
        }
        while (j < secondSize) {
            elements[k] = second[j]
            k++
            j++
        }
    }


}