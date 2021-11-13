package com.example.concepts.arrays

class Swap {
    fun main() {
        val arr = arrayOf(1, 3, 23, 9, 18)

        reverse(arr)

        println(arr.contentToString())
    }

    private fun swap(arr: Array<Int>, index1: Int, index2: Int) {
        val temp = arr[index1]
        arr[index1] = arr[index2]
        arr[index2] = temp
    }

    private fun reverse(arr: Array<Int>) =
        reverse(arr, 0, arr.lastIndex)

    private fun reverse(arr: Array<Int>, u: Int, v: Int) {
        if (u >= v) return
        swap(arr, u, v)
        return reverse(arr, u + 1, v - 1)
    }

}