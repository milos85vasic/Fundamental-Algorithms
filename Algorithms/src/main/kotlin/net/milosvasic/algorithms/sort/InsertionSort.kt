package net.milosvasic.algorithms.sort

class InsertionSort<T : Comparable<T>> : Sort<T> {

    override fun sort(elements: Array<T>, ascending: Boolean) {
        if(ascending){
            for (x in 1..elements.size - 1) {
                val key = elements[x]
                var y = x - 1
                while (y >= 0 && elements[y] > key) {
                    elements[y + 1] = elements[y]
                    y--
                }
                elements[y + 1] = key
            }
        } else {
            
        }
    }

}