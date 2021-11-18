package com.example.leetcode.p0167_two_sum_ii

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var start = 0
        var end = numbers.lastIndex

        while (start < end) {
            val cSum = numbers[start] + numbers[end]

            if (cSum == target) return intArrayOf(start+1, end+1)
            else if (cSum < target) start++
            else end--
        }

        return intArrayOf(-1, -1)
    }
}