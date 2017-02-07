package net.milosvasic.algorithms.search

interface Search<T : Comparable<T>> {

    fun find(elements: List<T>, criteria: T): T?

}
