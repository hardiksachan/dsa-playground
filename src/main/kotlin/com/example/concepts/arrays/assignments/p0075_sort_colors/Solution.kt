package com.example.concepts.arrays.assignments.p0075_sort_colors

class Solution {
    fun sortColors(nums: IntArray): Unit {
        fun swap(i: Int, j: Int) {
            val t = nums[i]
            nums[i] = nums[j]
            nums[j] = t
        }

        var zero = 0
        var two = nums.lastIndex

        var i = 0

        while (zero < two && i <= two) {
            if (nums[i] == 0) {
                swap(i, zero)
                zero++
                i++
            } else if (nums[i] == 2 && i <= two) {
                swap(i, two)
                two--
            } else {
                i++
            }
        }
    }
}

fun main() {
    val nums = intArrayOf(1, 2, 0)
    Solution().sortColors(nums)
    println(nums.contentToString())
}