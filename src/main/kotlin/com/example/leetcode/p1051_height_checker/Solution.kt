package com.example.leetcode.p1051_height_checker

class Solution {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.sorted()

        var ans = 0

        for (i in expected.indices) {
            if (heights[i] != expected[i]) ans++
        }

        return ans
    }
}