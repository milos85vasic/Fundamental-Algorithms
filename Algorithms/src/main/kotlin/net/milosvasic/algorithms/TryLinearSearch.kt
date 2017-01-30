package net.milosvasic.algorithms

import net.milosvasic.algorithms.search.LinearSearch

fun main(args: Array<String>) {
    // Prepare data
    val totalElements = 100 * 1000
    val randoms = getRandomData(totalElements, 0, 1000, true)
    val random = getRandomNumber(0, 1000)

    // Linear search
    val search = LinearSearch<Int>()

    var start = System.currentTimeMillis()
    val results = search.find(randoms, random)
    val elapsedTimeResults = getElapsedTime(start)

    start = System.currentTimeMillis()
    val result = search.findOne(randoms, random)
    val elapsedTimeResult = getElapsedTime(start)

    // Print data
    println("Linear search:\n")
    //    printData(randoms)
    println("Find one element, elements to search: [ $totalElements ]\nvalue to find: [ $random ]\nelapsed time: [ $elapsedTimeResult ]\nresult: [ $result ]")
    println("----------------------------------------")
    println("Find all occurrences, elements to search: [ $totalElements ]\nvalue to find: [ $random ]\nelapsed time: [ $elapsedTimeResults ]\nresults (count): [ ${results.size} ]")
    println("----------------------------------------")
}