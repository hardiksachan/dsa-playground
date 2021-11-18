package com.example.leetcode.p0441_arranging_coins

class Solution {
    fun arrangeCoins(n: Int): Int {
        val n: Long = n.toLong()
        var start: Long = 1
        var end : Long= 2

        while (coinsFor(end) < n) {
            val size = end - start + 1
            start = end + 1
            end = start + size * 2
        }

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (coinsFor(mid) == n) return mid.toInt()
            if (coinsFor(mid) < n) start = mid + 1
            else end = mid - 1
        }

        return end.toInt()

    }

    private fun coinsFor(level: Long): Long = ((level * (level + 1)) / 2)
}