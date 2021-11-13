package com.example.concepts.arrays

class Max {
    fun main() {
        val arr = arrayOf(1, 3, 8, 23, 9, 18)

        println(findMax(arr))
        println(findMax2(arr))
        println(findMaxIn(arr, 0, 2))
    }

    private fun findMaxIn(arr: Array<Int>, lower: Int, upper: Int): Int {
        var max = Int.MIN_VALUE

        for (i in lower..upper) {
            if (arr[i] >= max) max = arr[i]
        }
        return max
    }

    private fun findMax(arr: Array<Int>): Int {
        var max = Int.MIN_VALUE

        arr.forEach {
            if (it >= max) max = it
        }

        return max
    }

    private fun findMax2(arr: Array<Int>): Int =
        arr.fold(Int.MIN_VALUE) { acc, n -> if (acc > n) acc else n }
}