package com.example.leetcode.p0852_peak_index_in_a_mountain_array

class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 0
        var end = arr.lastIndex

        while (start < end) {
            val mid = start + (end - start) / 2

            if (arr[mid] < arr[mid+1]) {
                start = mid+1
            } else {
                end = mid
            }
        }
        return start
    }
}

fun main() {
    println(
        Solution().peakIndexInMountainArray(
            intArrayOf(3, 5, 3, 2, 0)
        )
    )
}
