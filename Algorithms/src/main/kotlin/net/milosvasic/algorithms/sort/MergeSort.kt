package net.milosvasic.algorithms.sort


class MergeSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: Array<T>, ascending: Boolean) {
        mergeSort(elements, 0, elements.lastIndex)
    }

    private fun mergeSort(elements: Array<T>, p: Int, r: Int) {
        if (p < r) {
            val q = (p + r) / 2
            println("q=$q")
            mergeSort(elements, p, q)
            mergeSort(elements, q, r)
        }
    }

    private fun merge(elements: Array<T>, p: Int, q: Int, r: Int) {

    }

}