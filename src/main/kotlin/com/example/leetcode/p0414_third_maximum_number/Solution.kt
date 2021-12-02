package com.example.leetcode.p0414_third_maximum_number

class Solution {
    fun thirdMax(nums: IntArray): Int {
        var m1: Int? = null
        var m2: Int? = null
        var m3: Int? = null

        for (num in nums) {
            if (m1 == null) {
                m1 = num
            } else if (num > m1) {
                m3 = m2
                m2 = m1
                m1 = num
            } else if (num == m1) {
                continue
            } else if (m2 == null) {
                m2 = num
            } else if (num > m2) {
                m3 = m2
                m2 = num
            } else if (num == m2) {
                continue
            } else if (m3 == null) {
                m3 = num
            } else if (num > m3) {
                m3 = num
            }
        }

        return m3 ?: m1!!
    }
}

fun main() {
    println(
        Solution().thirdMax(
            intArrayOf(2, 2, 3, 1)
        )
    )
}