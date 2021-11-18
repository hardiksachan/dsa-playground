package com.example.concepts.searching.binarysearch

import kotlin.math.round


fun search2DRowColSorted(arr: Array<IntArray>, target: Int): Pair<Int, Int> {
    var row = 0
    var col = arr[0].lastIndex

    while (row <= arr.lastIndex && col >= 0) {
        if (arr[row][col] == target) {
            return row to col
        } else if (arr[row][col] < target) {
            row++
        } else {
            col--
        }

    }

    return -1 to -1
}

fun searchSortedMatrix(arr: Array<IntArray>, target: Int): Pair<Int, Int> {
    val row = findRow(arr, target)
    val col = search(arr[row], target)

    return row to col
}

fun findRow(arr: Array<IntArray>, target: Int): Int {
    var start = 0
    var end = arr.lastIndex

    while (start < end) {
        val mid = start + (end - start) / 2

        if (arr[mid][0] >= target) {
            end = mid
        } else {
            start = mid + 1
        }
    }

    return start
}
