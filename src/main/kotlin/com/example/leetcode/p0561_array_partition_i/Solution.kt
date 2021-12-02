package com.example.leetcode.p0561_array_partition_i

class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()

        var ans = 0

        for (i in 0..nums.lastIndex step 2) {
            ans += nums[i]
        }

        return ans
    }
}