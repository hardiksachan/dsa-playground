package com.example.leetcode.p1608_special_array_with_x_elements_greater_than_or_equal_x

class Solution {
    fun specialArray(nums: IntArray): Int {
        nums.sort()

        var start = 1
        var end = 1000

        while (start <= end) {
            val mid = start + (end - start) / 2

            val elemsGreaterOrEq = elementsGreaterOrEqualTo(nums, mid)
            if (elemsGreaterOrEq > mid) {
                start = mid + 1
            } else if (elemsGreaterOrEq == mid) {
                return mid
            } else {
                end = mid - 1
            }
        }

        return -1
    }

    private fun elementsGreaterOrEqualTo(arr: IntArray, x: Int): Int {
        var start = 0
        var end = arr.lastIndex

        while (start < end) {
            val mid = start + (end - start) / 2

            if (arr[mid] < x) {
                start = mid + 1
            } else {
                end = mid
            }
        }

        if (end == arr.lastIndex && arr[end] < x) return 0
        return arr.size - end
    }
}