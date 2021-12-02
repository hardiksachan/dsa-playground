package com.example.leetcode.p0217_contains_duplicate

class Solution {
    // T: O(n log n)
    // S: O(1)
    fun containsDuplicate(arr: IntArray): Boolean {
        for (i in 0 until arr.lastIndex) {
            for (j in (i+1) downTo 1) {
                if (arr[j] == arr[j-1]) return true
                if (arr[j] > arr[j-1]) break // this line decides asc or desc

                val t = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = t
            }
        }

        return false
    }
}