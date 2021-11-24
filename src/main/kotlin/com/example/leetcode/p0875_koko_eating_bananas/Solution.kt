package com.example.leetcode.p0875_koko_eating_bananas

import kotlin.math.ceil

class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var start = 1
        var end = piles[0]

        piles.forEach {
            if (it > end) end = it
        }

        while (start < end) {
            val mid = start + (end - start) / 2

            val time = timeToEat(piles, mid)

            if (time > h) {
                start = mid +1
            } else {
                end = mid
            }
        }

        return end
    }

    private fun timeToEat(piles: IntArray, speed: Int): Int {
        var time = 0
        piles.forEach {
            time += ceil(it.toDouble() / speed.toDouble()).toInt()
        }
        return time
    }
}