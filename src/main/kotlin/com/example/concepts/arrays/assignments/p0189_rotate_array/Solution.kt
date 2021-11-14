package com.example.concepts.arrays.assignments.p0189_rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val res = IntArray(nums.size) { nums[(it - (k % nums.size) + nums.size) % nums.size] }
        nums.indices.forEach {
            nums[it] = res[it]
        }
    }
}

fun main() {
    val nums = intArrayOf(1, 2)

    Solution().rotate(nums, 3)

    println(nums.contentToString())
}