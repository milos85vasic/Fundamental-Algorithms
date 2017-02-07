package net.milosvasic.algorithms.search

class LinearSearch<T : Comparable<T>> : Search<T> {

    override fun find(elements: List<T>, criteria: T): T? {
        for (item in elements) {
            if (item == criteria) {
                return item
            }
        }
        return null
    }

}