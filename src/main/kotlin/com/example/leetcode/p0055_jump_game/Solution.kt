package com.example.leetcode.p0055_jump_game

import kotlin.math.max

class Solution {
    fun canJump(nums: IntArray): Boolean {
        var jumpCharge = 0

        nums.forEachIndexed { idx, charge ->
            jumpCharge--
            jumpCharge = max(jumpCharge, charge)
            if (jumpCharge <= 0 && idx != nums.lastIndex) return false
        }

        return true
    }
}

fun main() {
    println(Solution().canJump(intArrayOf(0)))
}