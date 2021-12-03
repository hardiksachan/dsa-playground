package com.example.leetcode.p1356_sort_integers_by_the_numbers_of_1_bits

class Solution {
    fun sortByBits(arr: IntArray): IntArray {
        var upper = 0

        val bitMap = mutableMapOf<Int, MutableList<Int>>() // set bit count, numbers

        arr.forEach {
            val bit = count1Bits(it)

            if (bit > upper) upper = bit

            if (bitMap.containsKey(bit)) {
                bitMap[bit]!!.add(it)
            } else {
                bitMap[bit] = mutableListOf(it)
            }
        }

        val ans = mutableListOf<Int>()

        for (i in 0..upper) {
            bitMap[i]?.let {
                ans.addAll(it.sorted())
            }
        }

        return ans.toIntArray()
    }

    private fun count1Bits(num: Int) = Integer.bitCount(num)

}