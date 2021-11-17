package com.example.leetcode.p1304_find_n_unique_integers_sum_up_to_zero

class Solution {
    fun sumZero(n: Int): IntArray {
        val arr = IntArray(n) { 0 }

        var i = 0
        (1..(n / 2)).forEach {
            arr[i] = it
            arr[i + 1] = -it
            i += 2
        }

        return arr
    }
}