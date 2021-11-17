package com.example.leetcode.p0053_maximum_subarray

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var globalMax = Int.MIN_VALUE
        var currMax = 0

        nums.forEach {
            if (currMax < 0) currMax = 0
            currMax += it

            if (currMax > globalMax) globalMax = currMax
        }

        return globalMax
    }
}