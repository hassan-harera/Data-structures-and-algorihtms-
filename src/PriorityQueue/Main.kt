package PriorityQueue

import java.util.*

fun main() {
    val q = PriorityQueue<Int>()

    for (i in 1..10) {
        q.insert(
            Random().nextInt(40)
        )
    }

    for (i in 1..3) {
        q.pop()
    }

    q.forEach {
        println("$it ")
    }

    q.forEach {
        println("$it ")
    }
}