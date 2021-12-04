package com.example.leetcode.p1502_can_make_arithmetic_progression_from_sequence

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()

        for (i in 1 until arr.lastIndex) {
            if (arr[i-1] - arr[i] != arr[i] - arr[i+1]) return false
        }

        return true
    }
}