package com.example.leetcode.p1672_richest_customer_wealth

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0
        accounts.map { it.sum() }.forEach {
            if (it > maxWealth) maxWealth = it
        }
        return maxWealth
    }
}

fun main() {
    println(
        Solution().maximumWealth(arrayOf(
            intArrayOf(1, 5),
            intArrayOf(7, 3),
            intArrayOf(3, 5)
        ))
    )
}