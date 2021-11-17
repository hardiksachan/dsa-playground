package com.example.leetcode.p1929_concatenation_of_array

class Solution {
    fun getConcatenation(nums: IntArray): IntArray = IntArray(nums.size * 2) { i ->
        nums[if (i < nums.size) i else i - nums.size] // can be replaced with i % nums.size
    }
}

fun main() {
    println(
        Solution().getConcatenation(intArrayOf(1, 2, 1)).contentToString()
    )
}