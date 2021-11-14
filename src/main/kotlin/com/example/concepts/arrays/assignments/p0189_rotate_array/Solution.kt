package com.example.concepts.arrays.assignments.p0189_rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        fun swap(i: Int, j: Int) {
            nums[i] = nums[i] + nums[j]
            nums[j] = nums[i] - nums[j]
            nums[i] = nums[i] - nums[j]
        }

        fun reverse(u: Int, v: Int) {
            var i = u
            var j = v
            while (j > i) {
                swap(i, j)
                i++
                j--
            }
        }

        reverse(0, nums.size - k % nums.size - 1)
        reverse(nums.size - k % nums.size, nums.lastIndex)
        reverse(0, nums.lastIndex)
    }
}

fun main() {
    val nums = intArrayOf(1, 2)

    Solution().rotate(nums, 3)

    println(nums.contentToString())
}