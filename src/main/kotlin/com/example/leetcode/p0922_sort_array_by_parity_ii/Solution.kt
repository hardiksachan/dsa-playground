package com.example.leetcode.p0922_sort_array_by_parity_ii

class Solution {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        var i = 0
        var j = 1

        while (i < nums.size && j < nums.size) {
            if (nums[i].isEven()) {
                i += 2
                continue
            }
            nums.swap(i, j)
            j += 2
        }

        return nums
    }

    private fun Int.isEven() = this % 2 == 0

    private fun IntArray.swap(u: Int, v: Int) {
        val t = this[u]
        this[u] = this[v]
        this[v] = t
    }
}