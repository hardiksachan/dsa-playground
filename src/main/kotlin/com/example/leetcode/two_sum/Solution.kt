package com.example.leetcode.two_sum

// Problem link: https://leetcode.com/problems/two-sum/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hm = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, num ->
            if (hm.containsKey(target - num) && hm[target - num] != i) {
                return intArrayOf(hm[target - num]!!, i)
            } else {
                hm[num] = i
            }
        }

        throw IllegalArgumentException()
    }
}

fun main() {
    println(
        Solution().twoSum(
            intArrayOf(3, 2, 4),
            6
        ).toList()
    )
}