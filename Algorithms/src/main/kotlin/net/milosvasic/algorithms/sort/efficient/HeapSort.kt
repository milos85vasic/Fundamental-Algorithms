package net.milosvasic.algorithms.sort.efficient

import net.milosvasic.algorithms.sort.Sort

class HeapSort<T : Comparable<T>> : Sort<T> {

    private var total = 0

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        total = elements.size - 1
        for (i in total / 2 downTo 0) {
            heapify(elements, i)
        }
        for (i in total downTo 1) {
            swap(elements, 0, i)
            total--
            heapify(elements, 0)
        }
    }

    private fun swap(elements: MutableList<T>, a: Int, b: Int) {
        val tmp = elements[a]
        elements[a] = elements[b]
        elements[b] = tmp
    }

    private fun heapify(elements: MutableList<T>, i: Int) {
        val lft = i * 2
        val rgt = lft + 1
        var grt = i

        if (lft <= total && elements[lft] > elements[grt]) grt = lft
        if (rgt <= total && elements[rgt] > elements[grt]) grt = rgt
        if (grt != i) {
            swap(elements, i, grt)
            heapify(elements, grt)
        }
    }

}