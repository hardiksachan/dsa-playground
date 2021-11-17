package com.example.leetcode.p1389_create_target_array_in_given_order

class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val list = mutableListOf<Int>()

        (0..nums.lastIndex).forEach { i ->
            list.add(index[i], nums[i])
        }

        return list.toIntArray()
    }
}

fun main() {
    println(
        Solution().createTargetArray(
            intArrayOf(0, 1, 2, 3, 4),
            intArrayOf(0, 1, 2, 2, 1)
        ).contentToString()
    )
}