package com.example.leetcode.p0540_single_element_in_a_sorted_array

class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]

        if (nums[0] < nums[1]) return nums[0]

        if (nums[nums.lastIndex] > nums[nums.lastIndex - 1]) return nums[nums.lastIndex]

        var start = 1
        var end = nums.lastIndex - 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    end = mid - 1
                } else if (nums[mid] == nums[mid + 1]) {
                    start = mid + 1
                } else {
                    return nums[mid]
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    start = mid + 1
                } else if (nums[mid] == nums[mid + 1]) {
                    end = mid - 1
                } else {
                    return nums[mid]
                }
            }
        }

        return -1
    }
}