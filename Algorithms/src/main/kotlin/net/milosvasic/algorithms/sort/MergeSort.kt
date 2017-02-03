package net.milosvasic.algorithms.sort


class MergeSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: Array<T>, ascending: Boolean) {
        mergeSort(elements, 0, elements.lastIndex)
    }

    private fun mergeSort(elements: Array<T>, start: Int, end: Int) {
        if (start < end) {
            val middle = (start + end) / 2
            mergeSort(elements, start, middle)
            mergeSort(elements, middle + 1, end)
            merge(elements, start, end)
        }
//
//
//        if (p < r) {
//            val q = (p + r) / 2
//            println("$p $q $r")
//            mergeSort(elements, p, q)
//            mergeSort(elements, q, r)
//            merge(elements, p, q, r)
//        }
    }

    private fun merge(elements: Array<T>, start: Int, end: Int) {
        val middle = (start + end) / 2
        var iFirst = 0
        var iSecond = 0
        var iMerged = 0
        while (iFirst < middle && iSecond < end) {
            if (elements[iFirst] < elements[iSecond]) {
                elements[iMerged] = elements[iFirst]
                iFirst++
            } else {
                elements[iMerged] = elements[iSecond];
                iSecond++
            }
            iMerged++
        }
    }

}