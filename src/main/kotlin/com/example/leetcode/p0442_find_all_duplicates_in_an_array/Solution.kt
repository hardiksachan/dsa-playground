package com.example.leetcode.p0442_find_all_duplicates_in_an_array

class Solution {
    fun findDuplicates(arr: IntArray): List<Int> {
        val ans = mutableSetOf<Int>()

        var i = 0
        while (i < arr.size) {
            val correctPos = arr[i] - 1

            if (i == correctPos) {
                i++
            } else if (arr[correctPos] == arr[i]) {
                ans.add(arr[i])
                i++
            } else {
                swap(arr, i, correctPos)
            }
        }

        return ans.toList()
    }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}