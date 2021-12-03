package com.example.leetcode.p1331_rank_transform_of_an_array

class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {
        val nums = arr.toSortedSet()
        val rankMap = HashMap<Int, Int>() // num, rank
        nums.forEachIndexed { idx, num ->
            rankMap[num] = idx + 1
        }

        return arr.map { rankMap[it]!! }.toIntArray()
    }
}