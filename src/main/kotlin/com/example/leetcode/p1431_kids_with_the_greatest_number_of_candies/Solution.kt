package com.example.leetcode.p1431_kids_with_the_greatest_number_of_candies

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val maxPreDonation = findMax(candies)

        return List(candies.size) { i ->
            candies[i] + extraCandies >= maxPreDonation
        }
    }

    private fun findMax(arr: IntArray): Int {
        var ans = Int.MIN_VALUE
        arr.forEach {
            if (it > ans)
                ans = it
        }
        return ans
    }
}

fun main() {
    println(
        Solution().kidsWithCandies(intArrayOf(2,3,5,1,3), 3)
    )
}