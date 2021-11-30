package com.example.leetcode.p0041_first_missing_positive

class Solution {
    fun firstMissingPositive(arr: IntArray): Int {
        var i = 0
        while (i < arr.size) {
            val correctPos = arr[i] - 1
            if (correctPos !in arr.indices || correctPos == i || arr[i] == arr[correctPos]) {
                i++
            } else {
                swap(arr, i, correctPos)
            }
        }

        arr.indices.forEach {
            if (arr[it] != it + 1) return it + 1
        }

        return arr.size + 1
    }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}