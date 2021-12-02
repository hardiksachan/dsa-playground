package com.example.leetcode.p0628_maximum_product_of_three_numbers

import java.lang.Integer.max

class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()

        val n = nums.size

        return max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[n - 1] * nums[1] * nums[0])
    }
}