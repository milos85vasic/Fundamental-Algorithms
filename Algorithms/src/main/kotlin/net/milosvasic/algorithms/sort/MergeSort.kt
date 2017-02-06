package net.milosvasic.algorithms.sort


class MergeSort<T : Comparable<T>> : Sort<T> {

    private var tmp = mutableListOf<T>()

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        tmp.addAll(elements)
        mergeSort(elements, 0, elements.size - 1, ascending)
        tmp = mutableListOf<T>()
    }

    private fun mergeSort(elements: MutableList<T>, start: Int, end: Int, ascending: Boolean) {
        if (start < end) {
            val middle = (start + end) / 2
            mergeSort(elements, start, middle, ascending)
            mergeSort(elements, middle + 1, end, ascending)
            merge(elements, start, middle, end, ascending)
        }
    }

    fun merge(elements: MutableList<T>, start: Int, middle: Int, end: Int, ascending: Boolean) {
        var i = start
        var k = start
        var j = middle + 1
        while (i <= middle && j <= end) {
            if (ascending) {
                if (elements[i] <= elements[j]) {
                    tmp[k++] = elements[i++]
                } else {
                    tmp[k++] = elements[j++]
                }
            } else {
                if (elements[i] >= elements[j]) {
                    tmp[k++] = elements[i++]
                } else {
                    tmp[k++] = elements[j++]
                }
            }
        }
        while (i <= middle) {
            tmp[k++] = elements[i++]
        }
        while (j < end) {
            tmp[k++] = elements[j++]
        }
        for (x in start..end) {
            elements[x] = tmp[x]
        }
    }


}