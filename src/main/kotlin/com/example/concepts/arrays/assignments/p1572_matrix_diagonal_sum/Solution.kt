package com.example.concepts.arrays.assignments.p1572_matrix_diagonal_sum

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var sum = 0
        (0..mat.lastIndex).forEach { i ->
            sum += mat[i][i]
            if (i != mat.lastIndex - i) {
                sum += mat[i][mat.lastIndex - i]
            }
        }
        return sum
    }
}