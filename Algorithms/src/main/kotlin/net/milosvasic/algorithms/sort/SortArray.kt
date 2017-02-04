package net.milosvasic.algorithms.sort


interface SortArray<T : Comparable<T>> {

    fun sort(elements: Array<T>, ascending: Boolean = true)

}