package com.example.leetcode.p0049_group_anagrams

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sorted = str.toCharArray().sorted().joinToString()

            if (result.containsKey(sorted)) {
                result[sorted]!!.add(str)
            } else {
                result[sorted] = mutableListOf(str)
            }
        }

        return result
            .map { (_, v) -> v }
    }
}