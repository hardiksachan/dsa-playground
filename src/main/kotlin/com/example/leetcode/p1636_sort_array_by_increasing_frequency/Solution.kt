package com.example.leetcode.p1636_sort_array_by_increasing_frequency

class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val frequencies = mutableMapOf<Int, Int>() // number, frequency

        for (num in nums) {
            if (frequencies.containsKey(num)) {
                frequencies[num] = frequencies[num]!! + 1
            } else {
                frequencies[num] = 1
            }
        }

        val freqTuple = frequencies.map { (k, v) -> k to v }.toMutableList() // number, freq

        for (i in 0 until freqTuple.lastIndex) {
            for (j in (i + 1) downTo 1) {
                if (freqTuple[j].second > freqTuple[j - 1].second) break // this line decides asc or desc

                else if (freqTuple[j].second == freqTuple[j - 1].second) {
                    if (freqTuple[j].first < freqTuple[j - 1].first) {
                        break
                    }
                }

                val t = freqTuple[j]
                freqTuple[j] = freqTuple[j - 1]
                freqTuple[j - 1] = t
            }
        }

        return freqTuple
            .map { (num, freq) -> List(freq) { num } }
            .flatten()
            .toIntArray()
    }
}