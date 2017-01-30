package net.milosvasic.algorithms.search

interface Search<T : Comparable<T>> {

    fun find(elements: Array<T>, criteria: T): List<T>

    fun findOne(elements: Array<T>, criteria: T): T?

}
