package com.example.leetcode.p1732_find_the_highest_altitude

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var maxAlt = 0
        var alt = 0

        gain.forEach {
            alt += it
            if (alt >= maxAlt) maxAlt = alt
        }

        return maxAlt
    }
}

fun main() {
    println(Solution().largestAltitude(intArrayOf(-5, 1, 5, 0, -7)))
}