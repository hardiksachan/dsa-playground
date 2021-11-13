package com.example.concepts.arrays.assignments.p0566_reshape_the_matrix

class Solution {
    fun matrixReshape(
        mat: Array<IntArray>,
        r: Int,
        c: Int
    ): Array<IntArray> = try {
        if (r * c != mat[0].size * mat.size) throw IllegalArgumentException()
        Array(r) { i ->
            IntArray(c) { j ->
                val flatPos = i * c + j
                mat[flatPos / mat[0].size][flatPos % mat[0].size]
            }
        }
    } catch (th: Throwable) {
        mat
    }
}

fun main() {
    println(
        Solution().matrixReshape(
            arrayOf(
                intArrayOf(1, 2, 3, 4)
            ),
            2, 2
        ).contentDeepToString()
    )
}