package com.example.leetcode.p0905_sort_array_by_parity

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val ans = mutableListOf<Int>()

        nums.forEach {
            if (it.isEven()) ans.add(0, it)
            ans.add(it)
        }

        return ans.toIntArray()
    }

    private fun Int.isEven() = this % 2 == 0


    fun sortArrayByParitySlow(nums: IntArray): IntArray {
        var i = 0
        var j = nums.lastIndex

        while (i < j) {
            if (nums[i].isEven()) {
                i++
                continue
            }
            nums.swap(i, j)
            j--
        }

        return nums
    }

    private fun IntArray.swap(u: Int, v: Int) {
        val t = this[u]
        this[u] = this[v]
        this[v] = t
    }
}