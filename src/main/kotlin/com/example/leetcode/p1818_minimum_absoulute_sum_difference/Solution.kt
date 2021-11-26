package com.example.leetcode.p1818_minimum_absoulute_sum_difference

import kotlin.math.abs

class Solution {
    fun minAbsoluteSumDiff(nums1: IntArray, nums2: IntArray): Int {
        val mod = 1000000007
        var asd = 0L

        nums1.indices.forEach { i ->
            asd += abs(nums2[i] - nums1[i])
        }

        if (asd == 0L) return 0

        val nums1Sorted = nums1.sorted()

        var masd = asd

        nums1.indices.forEach { i ->
            var start = 0
            var end = nums1Sorted.lastIndex

            while (start <= end) {
                val mid = start + (end - start) / 2

                val origDiff = abs(nums2[i] - nums1[i])
                val newDiff = abs(nums1Sorted[mid] - nums2[i])
                val newAsd = asd - origDiff + newDiff

                if (newAsd < masd) masd = newAsd

                if (nums1Sorted[mid] - nums2[i] < 0) {
                    start = mid + 1
                } else {
                    end = mid - 1
                }
            }
        }

        return (masd % mod).toInt()
    }
}