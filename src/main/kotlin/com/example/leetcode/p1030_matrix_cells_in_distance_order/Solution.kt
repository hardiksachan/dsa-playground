package com.example.leetcode.p1030_matrix_cells_in_distance_order

import kotlin.math.abs

class Solution {
    fun allCellsDistOrder(
        rows: Int,
        cols: Int,
        rCenter: Int,
        cCenter: Int
    ): Array<IntArray> {
        val distances = mutableMapOf<Int, MutableList<Pair<Int, Int>>>() // distance -> array of points

        var maxDistance = Int.MIN_VALUE

        for (x in 0 until rows) {
            for (y in 0 until cols) {
                val distance = distance(
                    x,
                    y,
                    rCenter,
                    cCenter
                )

                if (distance > maxDistance) maxDistance = distance

                if (distances.containsKey(distance)) {
                    distances[distance]!!.add(x to y)
                } else {
                    distances[distance] = mutableListOf(x to y)
                }
            }
        }

        val ans = mutableListOf<IntArray>()

        for (i in 0..maxDistance) {
            ans.addAll(distances[i]!!.map { (x, y) -> intArrayOf(x, y) })
        }

        return ans.toTypedArray()

    }

    private fun distance(x1: Int, y1: Int, x2: Int, y2: Int) = abs(x1 - x2) + abs(y1 - y2)
}