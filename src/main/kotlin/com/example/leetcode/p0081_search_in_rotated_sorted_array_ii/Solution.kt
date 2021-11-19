package com.example.leetcode.p0081_search_in_rotated_sorted_array_ii

class Solution {
    fun search(nums: IntArray, target: Int): Boolean {
        if (nums.size == 1) {
            return nums[0] == target
        }

        val pivot = findPivot(nums)

        if (pivot == -1) return nums[0] == target
        if (nums[pivot] == target) return true

        var ans = false
        ans = ans || search(nums, target, pivot + 1, nums.lastIndex)
        ans = ans || search(nums, target, 0, pivot - 1)

        return ans
    }

    fun search(arr: IntArray, target: Int, s: Int, e: Int): Boolean {
        var start = s
        var end = e

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (arr[mid] == target) {
                return true
            } else if (arr[mid] < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return false
    }

    fun findPivot(arr: IntArray): Int {
        if (arr[arr.lastIndex] > arr[0]) return arr.lastIndex

        var start = 0
        var end = arr.lastIndex

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start
                }
                start++

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1
                }
                end--
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return -1
    }
}

fun main() {
    println(
        Solution().findPivot(
            intArrayOf(1, 1)
        )
    )
}