package net.milosvasic.algorithms.search

interface Search<in T : Comparable<T>> {

    fun find(elements: List<T>, criteria: T): Int

}
