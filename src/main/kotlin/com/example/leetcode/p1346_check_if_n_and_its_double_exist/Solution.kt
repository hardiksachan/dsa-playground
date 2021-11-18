package com.example.leetcode.p1346_check_if_n_and_its_double_exist

class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val s = mutableSetOf<Int>()

        arr.forEach {
            if (s.contains(it * 2) || (it % 2 == 0 && s.contains(it / 2))) return true
            s.add(it)
        }

        return false
    }
}