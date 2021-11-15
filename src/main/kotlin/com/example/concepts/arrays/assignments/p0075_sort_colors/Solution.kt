package com.example.concepts.arrays.assignments.p0075_sort_colors

class Solution {
    fun sortColors(nums: IntArray): Unit {
        var zeroes = 0
        var ones = 0
        var twos = 0

        nums.forEach {
            when (it) {
                0 -> zeroes++
                1 -> ones++
                2 -> twos++
            }
        }

        nums.indices.forEach {
            if (zeroes > 0) {
                nums[it] = 0
                zeroes--
            } else if (ones > 0) {
                nums[it] = 1
                ones--
            } else if (twos > 0) {
                nums[it] = 2
                twos--
            }
        }
    }
}