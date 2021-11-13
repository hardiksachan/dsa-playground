package com.example.concepts.arrays.assignments.p0066_plus_one

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        val ans = mutableListOf<Int>()

        (digits.lastIndex downTo 0).forEach {
            val sum = digits[it] + carry
            carry = sum / 10
            ans.add(0, sum % 10)
        }

        if (carry != 0)
            ans.add(0, carry)

        return ans.toIntArray()
    }
}

fun main() {
    println(
        Solution().plusOne(intArrayOf(1, 2, 3)).contentToString()
    )
}