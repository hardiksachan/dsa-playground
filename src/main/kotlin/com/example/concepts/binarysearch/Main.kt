package com.example.concepts.binarysearch

fun main() {
    val arr = intArrayOf(48, 36, 20, 14, 12, 11, 9, 6, 4, 2)
    val target = 9
    println(orderAgnosticSearch(arr, target))
}

fun search(arr: IntArray, target: Int): Int {
    var start = 0
    var end = arr.lastIndex

    while (start <= end) {
        val mid = start + (end - start) / 2

        if (arr[mid] < target) {
            start = mid + 1
        } else if (arr[mid] == target) {
            return mid
        } else {
            end = mid - 1
        }
    }

    return -1
}

fun orderAgnosticSearch(arr: IntArray, target: Int): Int {
    var start = 0
    var end = arr.lastIndex

    val isAscending = arr.first() <= arr.last()

    while (start <= end) {
        val mid = start + (end - start) / 2

        if (arr[mid] == target) {
            return mid
        } else if ((arr[mid] < target && isAscending)
            || (arr[mid] > target && !isAscending)
        ) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    return -1
}


fun searchRecursively(arr: IntArray, target: Int): Int {
    fun go(arr: IntArray, target: Int, start: Int, end: Int): Int {
        if (start > end) return -1
        val mid = start + (end - start) / 2
        return if (arr[mid] < target) {
            go(arr, target, mid + 1, end)
        } else if (arr[mid] == target) {
            mid
        } else {
            go(arr, target, start, mid - 1)
        }
    }

    return go(arr, target, 0, arr.lastIndex)
}

