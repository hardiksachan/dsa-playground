package com.example.leetcode.p1365_how_many_numbers_are_smaller_than_the_current_number

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sorted = nums.sorted()

        val smallerMap = mutableMapOf<Int, Int>() // number, smaller count

        smallerMap[sorted[0]] = 0
        for (i in 1..sorted.lastIndex) {
            if (!smallerMap.containsKey(sorted[i])) {
                smallerMap[sorted[i]] = i
            }
        }

        return nums.map { smallerMap[it]!! }.toIntArray()
    }
}

fun main() {
    println(
        Solution().smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).contentToString()
    )
}