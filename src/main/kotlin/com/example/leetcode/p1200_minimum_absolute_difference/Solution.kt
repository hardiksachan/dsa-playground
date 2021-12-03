package com.example.leetcode.p1200_minimum_absolute_difference

class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        arr.sort()

        var minAbsDiff = Int.MAX_VALUE
        val ans = mutableListOf<List<Int>>()

        for (i in 0 until arr.lastIndex) {
            val diff = arr[i + 1] - arr[i]
            if (diff == minAbsDiff) {
                ans.add(listOf(arr[i], arr[i + 1]))
            } else if (diff < minAbsDiff) {
                minAbsDiff = diff
                ans.clear()
                ans.add(listOf(arr[i], arr[i + 1]))
            }
        }

        return ans
    }
}