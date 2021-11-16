package com.example.concepts.binarysearch.questions

import kotlin.system.measureTimeMillis

class InfiniteArray {
    fun main() {
        val target = 9999
        val ans: Int
        val time = measureTimeMillis {
            ans = binarySearch(target) { if (it < 50000) 0 else it }
        }
        println(ans)
        println("Time: $time ms")
    }

    fun binarySearch(target: Int, elementAt: (Int) -> Int): Int {
        var start = 0
        var end = 1

        while (true) {
            if (elementAt(end) >= target) break
            val size = end - start + 1
            start = end + 1
            end = start + 2 * size
        }

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (elementAt(mid) == target) return mid
            else if (elementAt(mid) < target) start = mid + 1
            else end = mid - 1
        }

        return -1
    }
}