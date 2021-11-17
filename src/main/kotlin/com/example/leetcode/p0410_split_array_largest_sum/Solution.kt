package com.example.leetcode.p0410_split_array_largest_sum

class Solution {
    fun splitArray(nums: IntArray, m: Int): Int {
        var start = nums[0]
        var end = 0

        nums.forEach {
            end += it
            if (it > start) start = it
        }

        while (start < end) {
            val mid = start + (end - start) / 2

            var pieces = 1
            var currSum = 0

            nums.forEach {
                if (currSum + it > mid) {
                    pieces += 1
                    currSum = 0
                }
                currSum += it
            }

            if (pieces <= m) {
                end = mid
            } else {
                start = mid + 1
            }
        }

        return start
    }
}