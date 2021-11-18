package com.example.leetcode.p0888_fair_candy_swap

class Solution {
    fun fairCandySwap(
        aliceSizes: IntArray,
        bobSizes: IntArray
    ): IntArray {
        val aliceTotal = aliceSizes.sum()
        val bobTotal = bobSizes.sum()

        val offset = (bobTotal - aliceTotal) / 2

        val cache = mutableMapOf<Int, Int>() // Key: Bob swaps, Value: Alice swaps

        aliceSizes.forEach {
            cache[it + offset] = it
        }

        bobSizes.forEach {
            if (cache.containsKey(it)) return intArrayOf(cache[it]!!, it)
        }

        return intArrayOf()
    }
}