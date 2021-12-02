package com.example.leetcode.p0169_majority_element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val freq = mutableMapOf<Int, Int>()
        val limit = nums.size / 2.0

        for (num in nums) {
            if (freq.containsKey(num)) {
                freq[num] = freq[num]!! + 1
            } else {
                freq[num] = 1
            }

            if (freq[num]!! > limit) {
                return num
            }
        }

        return -1
    }
}