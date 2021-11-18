package com.example.leetcode.p0367_valid_perfect_square

class Solution {
    fun isPerfectSquare(x: Int): Boolean {
        val x = x.toLong()
        if (x <= 1) return true

        var start: Long = 2
        var end: Long = x / 2 + 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            val midSq = mid * mid
            if (midSq == x) {
                return true
            } else if (midSq < x) {
                start = mid + 1
            } else {
                end = mid -1
            }
        }

        return false
    }
}