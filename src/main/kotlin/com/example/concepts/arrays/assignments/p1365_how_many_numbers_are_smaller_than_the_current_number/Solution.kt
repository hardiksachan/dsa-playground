package com.example.concepts.arrays.assignments.p1365_how_many_numbers_are_smaller_than_the_current_number

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val occurrences = mutableMapOf<Int, Int>()
        nums.forEach {
            if (occurrences.containsKey(it)) {
                occurrences[it] = occurrences[it]!! + 1
            } else {
                occurrences[it] = 1
            }
        }

        return  IntArray(nums.size) { i ->
            var count = 0
            (0 until nums[i]).forEach {
                count += occurrences[it] ?: 0
            }
            count
        }
    }
}

fun main() {
    println(
        Solution().smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).contentToString()
    )
}