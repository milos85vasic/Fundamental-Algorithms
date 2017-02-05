package net.milosvasic.algorithms.sort


class MergeSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: MutableList<T>, ascending: Boolean) {
        mergeSort(elements, 0, elements.size - 1, ascending)
    }

    private fun mergeSort(elements: MutableList<T>, start: Int, end: Int, ascending: Boolean) {
        if (start < end) {
            val middle = (start + end) / 2
            mergeSort(elements, start, middle, ascending)
            mergeSort(elements, middle + 1, end, ascending)
            merge(elements, start, middle, end, ascending)
        }
    }

    fun merge(elements: MutableList<T>, start: Int, middle: Int, end: Int, ascending: Boolean) {
        val firstSize = (middle + 1) - start
        val secondSize = (end + 1) - (middle + 1)
        var i = 0
        var j = 0
        var k = 0
        println("First size: $firstSize")
        println("Second size: $secondSize")
        while (i < firstSize && j < secondSize) {
            if (elements[i + start] <= elements[j + middle + 1]) {
                println(">>>>>> ${elements[i + start]}")
                i++
            } else {
                println(">>>>>> ${elements[j + middle + 1]}")
                j++
            }
            k++
        }

//        for(x in start..end){
//            println("->>> ${elements[x]}")
//        }

        for (x in start..middle) {
            println(elements[x])
        }
        println("--- --- ---")
        for (x in middle + 1..end) {
            println(elements[x])
        }
        println("---")



        /*

                var i = 0
        var j = 0
        var k = 0
        while (i < firstSize && j < secondSize) {
            if (ascending) {
                if (first[i] <= second[j]) {
                    elements[k] = first[i]
                    i++
                    k++
                } else {
                    elements[k] = second[j]
                    k++
                    j++
                }
            } else {
                if (first[i] >= second[j]) {
                    elements[k] = first[i]
                    i++
                    k++
                } else {
                    elements[k] = second[j]
                    k++
                    j++
                }
            }
        }


         */
    }


}