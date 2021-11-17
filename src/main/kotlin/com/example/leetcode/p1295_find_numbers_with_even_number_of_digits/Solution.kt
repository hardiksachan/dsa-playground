package com.example.leetcode.p1295_find_numbers_with_even_number_of_digits

import kotlin.math.log10

class Solution {
    fun findNumbers(nums: IntArray): Int {
        var ans = 0
        nums.forEach { num ->
            if (log10(num.toFloat()).toInt() % 2 != 0) ans++
        }
        return ans
    }
}

fun main() {
    println(
        Solution().findNumbers(intArrayOf(12,345,2,6,7896))
    )
}