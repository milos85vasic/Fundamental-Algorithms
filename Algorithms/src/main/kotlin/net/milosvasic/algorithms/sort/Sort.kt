package net.milosvasic.algorithms.sort


interface Sort<T : Comparable<T>> {

    fun sort(elements: MutableList<T>, ascending: Boolean = true)

}