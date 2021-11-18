package com.example.leetcode.p0069_sqrt_x

class Solution {
    fun mySqrt(x: Int): Int {
        val x = x.toLong()
        if (x <= 1) return x.toInt()

        var start: Long = 2
        var end: Long = x / 2 + 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            val midSq = mid * mid
            if (midSq == x) {
                return mid.toInt()
            } else if (midSq < x) {
                start = mid + 1
            } else {
                end = mid -1
            }
        }

        return end.toInt()
    }
}

fun main() {
    println(Solution().mySqrt(2147395599))
}