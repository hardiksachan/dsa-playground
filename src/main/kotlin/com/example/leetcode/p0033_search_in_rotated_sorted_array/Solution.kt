package com.example.leetcode.p0033_search_in_rotated_sorted_array

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.size == 1) {
            return if (nums[0] == target) 0 else -1
        }

        val pivot = findPivot(nums)

        if (nums[pivot] == target) return pivot
        if (target < nums[0]) return search(nums, target, pivot + 1, nums.lastIndex)
        return search(nums, target, 0, pivot - 1)
    }

    fun search(arr: IntArray, target: Int, s: Int, e: Int): Int {
        var start = s
        var end = e

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (arr[mid] == target) {
                return mid
            } else if (arr[mid] < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return -1
    }

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