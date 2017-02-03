package net.milosvasic.algorithms.sort

class SelectionSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: Array<T>, ascending: Boolean) {
        for (x in 0..elements.lastIndex) {
            var minmax_index = x
            for (y in x + 1..elements.lastIndex) {
                if (ascending) {
                    if (elements[y] < elements[minmax_index]) {
                        minmax_index = y
                    }
                } else {
                    if (elements[y] > elements[minmax_index]) {
                        minmax_index = y
                    }
                }
            }
            if (minmax_index != x) {
                val first = elements[x]
                val second = elements[minmax_index]
                elements[x] = second
                elements[minmax_index] = first
            }
        }
    }

}