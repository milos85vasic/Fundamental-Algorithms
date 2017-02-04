package net.milosvasic.algorithms.sort


interface SortList<T : Comparable<T>> {

    fun sort(elements: MutableList<T>, ascending: Boolean = true)

}