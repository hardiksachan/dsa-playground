package com.example.leetcode.p0448_find_all_numbers_disappeared_in_an_array

class Solution {
    fun findDisappearedNumbers(arr: IntArray): List<Int> {
        var i = 0
        while (i < arr.size) {
            val correctPos = arr[i] - 1
            if (i == correctPos || arr[correctPos] == arr[i]) {
                i++
            } else {
                swap(arr, i, correctPos)
            }
        }

        val ans = mutableListOf<Int>()

        arr.indices.forEach {
            if (arr[it] != it + 1) ans.add(it + 1)
        }

        return ans
    }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}

fun main() {
    val arr = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    println(Solution().findDisappearedNumbers(arr))
}