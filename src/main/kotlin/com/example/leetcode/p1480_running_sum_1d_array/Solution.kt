package com.example.leetcode.p1480_running_sum_1d_array

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        return IntArray(nums.size) { i ->
            sum += nums[i]
            sum
        }
    }
}

fun main() {
    println(
        Solution().runningSum(intArrayOf(1, 2, 3, 4)).contentToString()
    )
}