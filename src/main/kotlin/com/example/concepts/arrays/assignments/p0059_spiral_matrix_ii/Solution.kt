package com.example.concepts.arrays.assignments.p0059_spiral_matrix_ii

class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        val ans = Array(n) { IntArray(n) { 0 } }

        var leftBound = 0
        var rightBound = n - 1

        var topBound = 0
        var bottomBound = n - 1

        var i = 0
        var j = 0

        var direction = 0

        var fill = 1

        while (fill <= n * n) {
            ans[i][j] = fill
            fill++

            when (direction) {
                0 -> {
                    if (i == topBound && j == rightBound) {
                        direction = 1
                        topBound++
                    }
                }
                1 -> {
                    if (i == bottomBound && j == rightBound) {
                        direction = 2
                        rightBound--
                    }
                }
                2 -> {
                    if (i == bottomBound && j == leftBound) {
                        direction = 3
                        bottomBound--
                    }
                }
                3 -> {
                    if (i == topBound && j == leftBound) {
                        direction = 0
                        leftBound++
                    }
                }
            }

            when (direction) {
                0 -> j++
                1 -> i++
                2 -> j--
                3 -> i--
            }
        }

        return ans
    }

//    enum class Directions(val di: Int, val dj: Int) {
//        RIGHT(0, 1), // 0
//        DOWN(1, 0), // 1
//        LEFT(0, -1), // 2
//        UP(-1, 0) // 3
//    }
}

fun main() {
    println(
        Solution().generateMatrix(3).contentDeepToString()
    )
}