package com.example.leetcode.p0350_interseaction_of_two_arrays_ii

class Solution {
    fun intersect(
        nums1: IntArray,
        nums2: IntArray
    ): IntArray {
        val tracker1 = mutableMapOf<Int, Int>()
        nums1.forEach {
            tracker1[it] = (tracker1[it] ?: 0) + 1
        }

        val tracker2 = mutableMapOf<Int, Int>()
        nums2.forEach { num ->
            tracker1[num]?.let { count ->
                if (count > 0) {
                    tracker2[num] = (tracker2[num] ?: 0) + 1
                    tracker1[num] = tracker1[num]!! - 1
                }
            }
        }

        val result = mutableListOf<Int>()

        tracker2.forEach { num, count ->
            result.addAll(Array(count) { num })
        }

        return result.toIntArray()
    }
}