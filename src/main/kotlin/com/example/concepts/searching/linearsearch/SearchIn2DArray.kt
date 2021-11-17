package com.example.concepts.searching.linearsearch

class SearchIn2DArray {
    fun search(arr: Array<IntArray>, target: Int): Pair<Int, Int> {
        arr.indices.forEach { i ->
            arr[i].indices.forEach { j ->
                if (arr[i][j] == target) return i to j
            }
        }
        return -1 to -1
    }

    fun max(arr: Array<IntArray>): Int {
        var max = Int.MIN_VALUE
        arr.forEach { row ->
            row.forEach { num ->
                if (num > max) max = num
            }
        }
        return max
    }
}