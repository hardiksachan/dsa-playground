package com.example.leetcode.p0414_third_maximum_number

class Solution {
    fun thirdMax(arr: IntArray): Int {
//        val arr = nums.toSet().toIntArray()

        (arr.lastIndex downTo 1).forEach { i ->
            var maxIdx = 0
            (1..i).forEach { j ->
                if (arr[j] > arr[maxIdx]) maxIdx = j
            }

            val t = arr[i]
            arr[i] = arr[maxIdx]
            arr[maxIdx] = t
        }

        var distinct = 1
        var res = arr.last()

        (arr.lastIndex downTo 0).forEach { i ->
            if (arr[i] != res) {
                res = arr[i]
                distinct++
            }

            if (distinct == 3) {
                return res
            }
        }

        return arr.last()

    }
}