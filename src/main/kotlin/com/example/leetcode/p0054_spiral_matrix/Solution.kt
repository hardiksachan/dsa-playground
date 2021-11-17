package com.example.leetcode.p0054_spiral_matrix

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val ans = mutableListOf<Int>()

        var leftBound = 0
        var rightBound = matrix[0].lastIndex

        var topBound = 0
        var bottomBound = matrix.lastIndex

        var i = 0
        var j = 0

        var direction = Directions.RIGHT

        while (ans.size < matrix.size * matrix[0].size) {
            ans.add(matrix[i][j])

            when(direction) {
                Directions.RIGHT -> {
                    if (i == topBound && j == rightBound) {
                        direction = Directions.DOWN
                        topBound++
                    }
                }
                Directions.DOWN -> {
                    if (i == bottomBound && j == rightBound) {
                        direction = Directions.LEFT
                        rightBound--
                    }
                }
                Directions.LEFT -> {
                    if (i == bottomBound && j == leftBound) {
                        direction = Directions.UP
                        bottomBound--
                    }
                }
                Directions.UP -> {
                    if (i == topBound && j == leftBound) {
                        direction = Directions.RIGHT
                        leftBound++
                    }
                }
            }

            i += direction.di
            j += direction.dj
        }

        return ans
    }

    enum class Directions(val di: Int, val dj: Int) {
        RIGHT(0, 1),
        DOWN(1, 0),
        LEFT(0, -1),
        UP(-1, 0)
    }
}

fun main() {
    println(
        Solution().spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9),
            )
        )
    )
}