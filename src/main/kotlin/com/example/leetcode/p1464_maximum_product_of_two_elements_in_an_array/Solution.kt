package com.example.leetcode.p1464_maximum_product_of_two_elements_in_an_array

import java.lang.Integer.max

class Solution {
    fun maxProduct(nums: IntArray): Int {
        nums.sort()

        return max(
            (nums[0] - 1) * (nums[1] - 1),
            (nums[nums.lastIndex] - 1) * (nums[nums.lastIndex - 1] - 1),
        )
    }
}