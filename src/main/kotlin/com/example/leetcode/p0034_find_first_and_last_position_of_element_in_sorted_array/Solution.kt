package com.example.leetcode.p0034_find_first_and_last_position_of_element_in_sorted_array

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)

        if (nums.size == 1) {
            return if (nums[0] == target) intArrayOf(0, 0)
            else intArrayOf(-1, -1)
        }

        val s = searchFirst(nums, target)
        if (s == -1) return intArrayOf(-1, -1)
        val e = searchLast(nums, target)
        return intArrayOf(s, e)
    }

    private fun searchFirst(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.lastIndex

        while (end >= start) {
            val mid = (start + end) / 2

            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target)
                    return mid
                else
                    end = mid - 1
            } else if (nums[mid] > target) {
                end = mid - 1
            } else if (nums[mid] < target) {
                start = mid + 1
            }
        }

        return -1
    }

    private fun searchLast(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.lastIndex

        while (end >= start) {
            val mid = (start + end) / 2

            if (nums[mid] == target) {
                if (mid == nums.lastIndex || nums[mid + 1] != target)
                    return mid
                else
                    start = mid + 1
            } else if (nums[mid] > target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return -1
    }
}

fun main() {
    println(
        Solution().searchRange(
            intArrayOf(5, 7, 7, 8, 8, 10),
            8
        ).contentToString()
    )
}