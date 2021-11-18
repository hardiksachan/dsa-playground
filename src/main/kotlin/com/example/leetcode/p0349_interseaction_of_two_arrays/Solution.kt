package com.example.leetcode.p0349_interseaction_of_two_arrays

class Solution {
    fun intersection(
        nums1: IntArray,
        nums2: IntArray
    ): IntArray {
        val tracker = mutableMapOf<Int, Boolean>()

        nums1.forEach {
            tracker[it] = false
        }

        nums2.forEach {
            if (tracker.containsKey(it)) {
                tracker[it] = true
            }
        }

        return tracker.filterValues { it }.keys.toIntArray()
    }
}