package com.example.leetcode.p0073_set_matrix_zeroes

class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        var j0Flagged = false
        var i0Flagged = false
        // Flag Rows and Columns
        matrix.indices.forEach { i ->
            matrix[0].indices.forEach { j ->
                if (matrix[i][j] == 0) {
                    if (j == 0) j0Flagged = true
                    else matrix[0][j] = 0

                    if (i == 0) i0Flagged = true
                    else matrix[i][0] = 0
                }
            }
        }

        // Set rows and columns to 0

        (1..matrix.lastIndex).forEach { i ->
            if (matrix[i][0] == 0) {
                matrix[0].indices.forEach { j ->
                    matrix[i][j] = 0
                }
            }
        }

        (1..matrix[0].lastIndex).forEach { j ->
            if (matrix[0][j] == 0) {
                matrix.indices.forEach { i ->
                    matrix[i][j] = 0
                }
            }
        }

        if (j0Flagged) {
            matrix.indices.forEach { i ->
                matrix[i][0] = 0
            }
        }

        if (i0Flagged) {
            matrix[0].indices.forEach { j ->
                matrix[0][j] = 0
            }
        }
    }
}

fun main () {
    val mat = arrayOf(
        intArrayOf(1, 0)
    )
    Solution().setZeroes(mat)
    println(mat.contentDeepToString())
}