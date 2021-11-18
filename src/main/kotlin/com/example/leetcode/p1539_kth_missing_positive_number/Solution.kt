package com.example.leetcode.p1539_kth_missing_positive_number

class Solution {
    // O(log n)
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var start = 0
        var end = arr.lastIndex

        fun missing(i: Int): Int = arr[i] - i - 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (missing(mid) < k) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        if (end < 0) return k

        return arr[end] + k - missing(end)
    }

    // O(n)
    fun findKthPositive2(arr: IntArray, k: Int): Int {
        var missingCount = 0
        var numToCheck = 1
        var lastMissingNum = 0

        var i = 0
        while(missingCount < k) {
            if (i < arr.size && arr[i] == numToCheck) {
                numToCheck++
                i++
            } else {
                lastMissingNum = numToCheck
                missingCount++
                numToCheck++
            }
        }

        return lastMissingNum
    }
}