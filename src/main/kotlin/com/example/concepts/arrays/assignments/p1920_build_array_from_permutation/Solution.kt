package com.example.concepts.arrays.assignments.p1920_build_array_from_permutation

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        return IntArray(nums.size) { nums[nums[it]] }
    }
}

fun main() {
    println(
        Solution().buildArray(intArrayOf(0, 2, 1, 5, 3, 4)).contentToString()
    )
}