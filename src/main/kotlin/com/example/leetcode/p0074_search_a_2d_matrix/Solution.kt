package com.example.leetcode.p0074_search_a_2d_matrix

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var start = 0
        var end = (matrix.size * matrix[0].size) - 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            val el = matrix[mid / matrix[0].size][mid % matrix[0].size]

            if (el == target) {
                return true
            } else if (el < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return false
    }
}