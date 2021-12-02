package com.example.leetcode.p0976_largest_perimeter_triangle

class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        nums.sort()

        var i = nums.lastIndex - 2

        while (i >= 0) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return nums[i + 2] + nums[i + 1] + nums[i]
            }
            i--
        }

        return 0
    }
}

fun main() {
    println(
        Solution().largestPerimeter(
            intArrayOf(2, 2, 1)
        )
    )
}