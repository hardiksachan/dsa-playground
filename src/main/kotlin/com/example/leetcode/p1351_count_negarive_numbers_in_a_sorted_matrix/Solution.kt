package com.example.leetcode.p1351_count_negarive_numbers_in_a_sorted_matrix

class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var totalNegatives = 0
        var searchBound = grid[0].lastIndex

        grid.indices.forEach { rowIdx ->
            firstNegativeIndex(grid[rowIdx], searchBound)?.let {
                searchBound = it
                totalNegatives += grid[0].size - searchBound
            }
        }

        return totalNegatives
    }

    private fun firstNegativeIndex(row: IntArray, searchBound: Int): Int? {
        var start = 0
        var end = searchBound

        while (start < end) {
            val mid = start + (end-start)/2

            if (row[mid] > -1) start = mid + 1
            else end = mid
        }

        return if (row[end] >= 0) null else end
    }
}