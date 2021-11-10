package com.example.leetcode.container_with_most_water

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {

    }

    fun trimShortSides(heights: IntArray): IntArray {
        val minH = min(heights.first(), heights.last())

        if (heights[1] > minH && heights[heights.lastIndex - 1] > minH) {

        }
    }
}

fun main() {
    println(
        Solution().maxArea(
            intArrayOf(4, 3, 2, 1, 4)
        )
    )
}