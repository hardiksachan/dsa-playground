package com.example.leetcode.p1512_number_of_good_pairs

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var ans = 0

        (0..nums.lastIndex).forEach { i ->
            (0 until i).forEach { j ->
                if (nums[i] == nums[j]) ans++
            }
        }

        return ans
    }

    // Better Performance
    fun numIdenticalPairs2(nums: IntArray): Int {
        val counts = mutableMapOf<Int, Int>()
        var ans = 0

        nums.forEachIndexed { i, num ->
            if (counts.containsKey(num)) {
                ans += counts[num]!!
                counts[num] = counts[num]!! + 1
            } else {
                counts[num] = 1
            }
        }

        return ans
    }
}

fun main() {
    println(Solution().numIdenticalPairs2(intArrayOf(1, 2, 3, 1, 1, 3)))
}