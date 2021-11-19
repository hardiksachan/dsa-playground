package com.example.leetcode.p0153_find_minimum_in_rotated_sorted_array

class Solution {
    fun findMin(nums: IntArray): Int = nums[(findPivot(nums) + 1) % nums.size]

    private fun findPivot(arr: IntArray): Int {
        if (arr[arr.lastIndex] > arr[0]) return arr.lastIndex

        var start = 0
        var end = arr.lastIndex - 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (arr[mid] > arr[mid + 1]) {
                return mid
            } else if (arr[mid] < arr[0]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return -1
    }
}