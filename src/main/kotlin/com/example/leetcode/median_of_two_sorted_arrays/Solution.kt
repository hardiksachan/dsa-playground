package com.example.leetcode.median_of_two_sorted_arrays

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val merged: IntArray = merge(nums1, nums2)

        return if (merged.size.isEven()) {
            (merged[merged.size / 2 - 1].toDouble() + merged[merged.size / 2].toDouble()) / 2.0
        } else {
            merged[(merged.size + 1) / 2 - 1].toDouble()
        }
    }

    private fun merge(nums1: IntArray, nums2: IntArray): IntArray {
        val merged = IntArray(nums1.size + nums2.size)

        var i = 0
        var j = 0
        var k = 0
        while (true) {
            if (i >= nums1.size && j < nums2.size) {
                merged[k] = nums2[j]
                j++
            } else if (i < nums1.size && j >= nums2.size) {
                merged[k] = nums1[i]
                i++
            } else if (k >= merged.size) {
                break
            } else {
                if (nums1[i] < nums2[j]) {
                    merged[k] = nums1[i]
                    i++
                } else {
                    merged[k] = nums2[j]
                    j++
                }
            }

            k++
        }

        return merged
    }

    private fun Int.isEven() = this % 2 == 0
}

fun main() {
    println(
        Solution().findMedianSortedArrays(
            intArrayOf(1, 3),
            intArrayOf(2, 4)
        )
    )
}