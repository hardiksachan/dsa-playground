package com.example.concepts.arrays.assignments.p0885_spiral_matrix_iii

class Solution {
    fun spiralMatrixIII(
        R: Int,
        C: Int,
        x: Int,
        y: Int
    ): Array<IntArray> {
        val res = Array(R * C) { IntArray(2) }
        var dx = 0
        var dy = 1
        var n = 0

        var x = x
        var y = y

        var j = 0
        while (j < R * C) {
            for (i in 0 until n / 2 + 1) {
                if (x in 0 until R && y in 0 until C) res[j++] = intArrayOf(x, y)
                x += dx
                y += dy
            }
            val tmp = dx
            dx = dy
            dy = -tmp
            n++
        }

        return res
    }
}

fun main() {
    println(
        Solution().spiralMatrixIII(
            5, 6, 1, 4
        ).contentDeepToString()
    )
}