package com.example.concepts.arrays.assignments.p1470_shuffle_the_array

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray =
        IntArray(2 * n) {
            if (it % 2 == 0) {
                nums[it / 2]
            } else {
                nums[(it - 1) / 2 + n]
            }
        }
}

fun main() {
    println(
        Solution().shuffle(intArrayOf(2,5,1,3,4,7), 3).contentToString()
    )
}