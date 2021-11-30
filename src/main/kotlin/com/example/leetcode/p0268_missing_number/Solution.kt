package com.example.leetcode.p0268_missing_number

class Solution {
    fun missingNumber(arr: IntArray): Int {
        val expectedSum = arr.size * (arr.size + 1) / 2
        val actualSum = arr.sum()
        return expectedSum - actualSum
    }

    fun missingNumberCyclicSort(arr: IntArray): Int {
        var i = 0
        while (i < arr.size) {
            if (arr[i] == i || arr[i] == arr.size) {
                i++
            } else {
                swap(arr, i, arr[i])
            }
        }

        arr.indices.forEach { j ->
            if (arr[j] != j) return j
        }

        return arr.size
    }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}

fun main() {
    val arr = intArrayOf(3, 0, 1)
    println(Solution().missingNumber(arr))
}