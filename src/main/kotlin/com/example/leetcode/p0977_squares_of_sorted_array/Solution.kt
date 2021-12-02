package com.example.leetcode.p0977_squares_of_sorted_array

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var i = findFirstNonNegative(nums) // positive
        var j = i - 1 // negative

        val ans = mutableListOf<Int>()

        while (i < nums.size && j >= 0) {
            if (nums[i] < -nums[j]) {
                ans.add(nums[i] * nums[i])
                i++
            } else {
                ans.add(nums[j] * nums[j])
                j--
            }
        }

        while (i < nums.size) {
            ans.add(nums[i] * nums[i])
            i++
        }

        while (j >= 0) {
            ans.add(nums[j] * nums[j])
            j--
        }

        return ans.toIntArray()
    }

    private fun findFirstNonNegative(arr: IntArray): Int {
        var start = 0
        var end = arr.lastIndex

        while (start <= end) {
            val mid = start + (end - start) / 2

            if ((mid == 0 && arr[mid] >= 0) || (arr[mid] >= 0 && arr[mid - 1] < 0)) {
                return mid
            } else if (arr[mid] >= 0) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return start
    }
}

fun main() {
    println(
        Solution().sortedSquares(
            intArrayOf(-2, 0)
        ).contentToString()
    )
}