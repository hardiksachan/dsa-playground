package com.example.concepts.arrays.assignments.p0867_transpose_matrix

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val m = matrix.size
        val n = matrix[0].size

        return Array(n) { i->
            IntArray(m) { j->
                matrix[j][i]
            }
        }
    }
}