package com.example.leetcode.p0056_merge_intervals

import kotlin.math.max

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size < 2) return intervals

        intervals.sortBy { it[0] }

        val result = intervals.toMutableList()

        var i = 1
        while (i < result.size) {
            if (result[i][0] <= result[i - 1][1]) {
                result[i - 1][1] = max(result[i][1], result[i - 1][1])
                result.removeAt(i)
            } else {
                i++
            }
        }

        return result.toTypedArray()
    }
}