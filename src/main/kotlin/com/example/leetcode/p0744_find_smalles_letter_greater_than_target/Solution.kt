package com.example.leetcode.p0744_find_smalles_letter_greater_than_target

class Solution {
    fun nextGreatestLetter(
        letters: CharArray,
        target: Char
    ): Char {
        var start = 0
        var end = letters.lastIndex

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (letters[mid] <= target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return letters[start % letters.size]
    }
}