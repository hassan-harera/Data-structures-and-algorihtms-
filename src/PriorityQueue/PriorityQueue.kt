package PriorityQueue

import kotlin.collections.ArrayList

class PriorityQueue<T : Comparable<T>>(size: Int = 0) : Iterator<T> {
    val list = ArrayList<T>(size)
    private var idx = 1

    fun insert(element: T) {
        if (list.isEmpty())
            list.add(element)

        list.add(element)
        heap(list.lastIndex)
    }

    fun pop(): T {
        val el = list[1]
        list.removeAt(1)
        heap(list.lastIndex)
        return el
    }

    private fun heap(idx: Int) {
        var idx2: Int = idx
        var idx1: Int = idx / 2
        while (idx1 > 0) {
            if (list[idx1] > list[idx2]) {
                val temp = list[idx1]
                list[idx1] = list[idx2]
                list[idx2] = temp
            }
            idx2 /= 2 + 1
            idx1 /= 2 + 1
        }
    }

    override fun hasNext(): Boolean = idx < list.size

    override fun next(): T = list[idx++]
}