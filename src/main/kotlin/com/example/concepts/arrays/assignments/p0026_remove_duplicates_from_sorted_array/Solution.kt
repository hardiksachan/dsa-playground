package com.example.concepts.arrays.assignments.p0026_remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size

        var updatePos = 0
        var readPos = 1
        var lastUpdate = nums[0]

        while (readPos < nums.size) {
            if (nums[readPos] != lastUpdate) {
                updatePos++
                nums[updatePos] = nums[readPos]
                lastUpdate = nums[readPos]
            }
            readPos++
        }

        return updatePos + 1
    }
}