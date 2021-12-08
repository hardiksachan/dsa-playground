package com.example.leetcode.p0015_3sum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val triplets = mutableSetOf<List<Int>>()

        nums.sort()

        if (nums.isEmpty()) return emptyList()

        if (nums[nums.lastIndex] < 0) return emptyList()
        if (nums[0] > 0) return emptyList()

        for (i in 0..nums.lastIndex) {
            if (nums[i] > 0) break

            var lo = i + 1
            var hi = nums.lastIndex

            while (lo < hi) {
                val sum = nums[i] + nums[lo] + nums[hi]

                if (sum == 0) {
                    triplets.add(listOf(nums[i], nums[lo], nums[hi]))
                    lo++
                    hi--
                } else if (sum > 0) {
                    hi--
                } else {
                    lo++
                }
            }
        }

        return triplets.toList()
    }

    fun threeSum2(nums: IntArray): List<List<Int>> {
        val triplets = mutableSetOf<List<Int>>()

        nums.sort()

        for (j in 1 until nums.lastIndex) {
            val target = -nums[j]
            val m = mutableMapOf<Int, Int>()

            for (i in 0 until j) {
                if (nums[i] > 0) break
                m[target - nums[i]] = nums[i]
            }

            for (k in (j + 1)..nums.lastIndex) {
                if (m.containsKey(nums[k])) {
                    triplets.add(listOf(m[nums[k]]!!, nums[j], nums[k]))
                }
            }
        }

        return triplets.toList()
    }
}

fun main() {
    println(
        Solution().threeSum(
            intArrayOf(-1, 0, 1, 2, -1, -4)
        )
    )
}