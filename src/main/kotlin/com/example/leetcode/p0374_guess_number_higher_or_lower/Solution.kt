package com.example.leetcode.p0374_guess_number_higher_or_lower

class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var start = 1
        var end = n

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (guess(mid) == 0) return mid
            else if (guess(mid) == 1) start = mid + 1
            else end = mid - 1
        }

        return -1
    }

    override fun guess(num: Int): Int {
        val pick = 6

        return if (pick < num) -1
        else if (num == pick) 0
        else 1
    }
}

fun main() {
    println(Solution().guessNumber(10))
}