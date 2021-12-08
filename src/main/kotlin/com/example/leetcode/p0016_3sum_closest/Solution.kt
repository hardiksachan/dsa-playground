package com.example.leetcode.p0016_3sum_closest

import kotlin.math.abs

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var closest = nums[0] + nums[1] + nums[2]

        nums.sort()

        if (nums[nums.lastIndex] < target) return closest
        if (nums[0] > target) return closest

        for (i in 0..nums.lastIndex) {
            if (nums[i] > target) break

            var lo = i + 1
            var hi = nums.lastIndex

            while (lo < hi) {
                val sum = nums[i] + nums[lo] + nums[hi]

                if (abs(sum - target) < abs(closest - target)) {
                    closest = sum
                }

                if (sum == target) {
                    return target
                } else if (sum > target) {
                    hi--
                } else {
                    lo++
                }
            }
        }

        return closest
    }
}