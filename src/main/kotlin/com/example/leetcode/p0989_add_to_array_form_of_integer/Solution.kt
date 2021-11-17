package com.example.leetcode.p0989_add_to_array_form_of_integer

class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val ans = mutableListOf<Int>()

        var carry = k
        var i = num.lastIndex

        while (carry > 0) {
            if (i < 0) {
                val digit = carry % 10
                carry /= 10
                ans.add(0, digit)
                continue
            }

            val sum = carry + num[i]

            val digit = sum % 10
            carry = sum / 10
            ans.add(0, digit)

            i--
        }

        while (i >= 0) {
            ans.add(0, num[i])
            i--
        }

        return ans
    }
}
