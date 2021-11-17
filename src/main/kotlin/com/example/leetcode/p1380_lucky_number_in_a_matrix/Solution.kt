package com.example.leetcode.p1380_lucky_number_in_a_matrix

class Solution {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val minInRow = IntArray(matrix.size) {
            var min = matrix[it][0]
            matrix[it].forEach { num ->
                if (num < min) min = num
            }
            min
        }

        val maxInCol = IntArray(matrix[0].size) {
            var max = matrix[0][it]
            matrix.forEach { inner ->
                if (inner[it] > max) max = inner[it]
            }
            max
        }

        val lucky = mutableListOf<Int>()

        matrix.indices.forEach { i ->
            matrix[0].indices.forEach { j ->
                val num = matrix[i][j]
                if (num == maxInCol[j] && num == minInRow[i]) lucky.add(num)
            }
        }

        return lucky
    }
}