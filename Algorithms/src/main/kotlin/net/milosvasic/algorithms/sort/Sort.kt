package net.milosvasic.algorithms.sort


interface Sort<T : Comparable<T>> {

    fun sort(elements: Array<T>, ascending: Boolean = true)

}