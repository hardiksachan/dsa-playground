package com.example.leetcode.p1773_count_items_matching_a_rule

import kotlin.IllegalArgumentException

class Solution {
    fun countMatches(
        items: List<List<String>>,
        ruleKey: String,
        ruleValue: String
    ): Int {
        var ans = 0
        val ruleIdx = when (ruleKey) {
            "type" -> 0
            "color" -> 1
            "name" -> 2
            else -> throw IllegalArgumentException()
        }
        items.forEach { item ->
            if (item[ruleIdx] == ruleValue) ans++
        }
        return ans
    }
}

fun main () {
    println(
        Solution().countMatches(
            listOf(
                listOf("phone","blue","pixel"),
                listOf("computer","silver","lenovo"),
                listOf("phone","gold","iphone")
            ), "color", "silver"
        )
    )
}