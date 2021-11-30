package com.example.leetcode.p0287_find_the_duplicate_number

class Solution {
    fun findDuplicate(arr: IntArray): Int {
        var i = 0
        while (i < arr.lastIndex) {
            val correctPos = arr[i] - 1

            if (i == correctPos) {
                i++
            } else if (arr[correctPos] == arr[i]) {
                return arr[i]
            }
            else {
                swap(arr, i, correctPos)
            }
        }

        return arr[arr.lastIndex]
    }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}