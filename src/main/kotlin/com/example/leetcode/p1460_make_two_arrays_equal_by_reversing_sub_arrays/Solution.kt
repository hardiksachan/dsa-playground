package com.example.leetcode.p1460_make_two_arrays_equal_by_reversing_sub_arrays

class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean  = target.sorted() == arr.sorted()
}