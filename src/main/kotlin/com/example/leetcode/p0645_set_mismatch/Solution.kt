package com.example.leetcode.p0645_set_mismatch

class Solution {
    fun findErrorNums(arr: IntArray): IntArray {
        var i = 0
        while (i < arr.size) {
            val correctPos = arr[i] - 1

            if (i == correctPos || arr[correctPos] == arr[i]) {
                i++
            } else {
                swap(arr, i, correctPos)
            }
        }

        for (it in arr.indices) {
            if (arr[it] != it + 1) return intArrayOf(arr[it], it + 1)
        }

        return intArrayOf(-1, -1)
    }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}