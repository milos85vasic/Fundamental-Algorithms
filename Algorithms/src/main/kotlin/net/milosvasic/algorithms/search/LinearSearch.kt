package net.milosvasic.algorithms.search

class LinearSearch<in T : Comparable<T>> : Search<T> {

    override fun find(elements: List<T>, criteria: T): Int {
        for (x in 0..elements.lastIndex) {
            if (elements[x] == criteria) {
                return x
            }
        }
        return -1
    }

}