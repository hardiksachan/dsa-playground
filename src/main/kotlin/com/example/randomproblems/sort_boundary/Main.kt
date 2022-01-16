package com.example.randomproblems.sort_boundary

class Solution() {
    fun sortBoundary(arr: Array<IntArray>) {
        val row = arr.size
        val col = arr[0].size

        bubbleSort(
            2 * (row + col),
            { pos ->
                if (pos <= row) {
                    0 to (pos - 1)
                } else if (pos <= row + col) {
                    (pos - col - 1) to (col - 1)
                } else if (pos <= row + col + row) {
                    (row - 1) to (col - (pos - row - col))
                } else {
                    -1 to -1
                }
            },
            arr
        )
    }

    private fun bubbleSort(size: Int, mapIdx: (Int) -> Pair<Int, Int>, arr: Array<IntArray>) {
        for (i in 0 until size) {
            for (j in (i + 1) downTo 1) {
                val atJ = mapIdx(j)
                val atBeforeJ = mapIdx(j - 1)
                if (atJ.let { (u, v) -> arr[u][v] } >= atBeforeJ.let { (u, v) -> arr[u][v] }) break // this line decides asc or desc

                swap(atJ.first, atJ.second, atBeforeJ.first, atBeforeJ.second, arr)
            }
        }
    }

    private fun swap(i1: Int, j1: Int, i2: Int, j2: Int, arr: Array<IntArray>) {
        val temp = arr[i1][j1]
        arr[i1][j1] = arr[i2][j2]
        arr[i2][j2] = temp
    }
}

fun main() {

}