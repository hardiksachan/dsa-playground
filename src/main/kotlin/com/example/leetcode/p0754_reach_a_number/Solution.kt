package com.example.leetcode.p0754_reach_a_number

import kotlin.math.absoluteValue

class Solution {
    fun reachNumber(target: Int): Int {
        val target = target.absoluteValue

        var start = 0
        var end = 1

        while (elemAt(end) < target) {
            val size = end - start + 1
            start = end + 1
            end = start + size * 2
        }

        while (start <= end) {
            val mid = start + (end - start) / 2

            val elem = elemAt(mid)
            if (elem > target) end = mid - 1
            else if (elem == target) {
                return mid
            } else start = mid + 1
        }

        val diff = target - elemAt(end)
        val additionalSteps = if (diff % 2 == 0) {
            0
        } else {
            if (end % 2 == 0) 1 else 2
        }

        return end + additionalSteps
    }

    private fun elemAt(pos: Int) = (pos * (pos + 1)) / 2
}

fun main() {
    println(
        Solution().reachNumber(4)
    )
}