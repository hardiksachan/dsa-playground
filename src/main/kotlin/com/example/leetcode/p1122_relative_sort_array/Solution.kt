package com.example.leetcode.p1122_relative_sort_array

class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val part1Map = mutableMapOf<Int, Int>()
        arr2.forEach { part1Map[it] = 0 }

        val part2 = mutableListOf<Int>()

        arr1.forEach {
            if (part1Map.containsKey(it)) part1Map[it] = part1Map[it]!! + 1
            else part2.add(it)
        }

        val ans = mutableListOf<Int>()
        arr2.forEach { num ->
            ans.addAll(List(part1Map[num]!!) { num })
        }

        ans.addAll(part2.sorted())

        return ans.toIntArray()
    }
}