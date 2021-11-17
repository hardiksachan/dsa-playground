package com.example.concepts.searching.binarysearch

class CeilingFloorOfANumber {
    fun main() {
        val arr = intArrayOf(2, 3, 5, 9, 14, 16, 18)
        val target = -5
        val ans = findFloor(arr, target)
        println(ans)
        println(arr[ans])
    }

    // arr is in ascending order
    // arr has at least one element
    private fun findCeil(arr: IntArray, target: Int): Int {
        if (target <= arr.first()) return 0

        var start = 0
        var end = arr.lastIndex

        while (start <= end) {
            val mid = start + (end - start) / 2
            if (arr[mid] >= target && arr[mid - 1] < target) return mid
            else if (arr[mid] < target) start = mid + 1
            else end = mid - 1
        }

        return -1
    }

    private fun findCeil2(arr: IntArray, target: Int): Int {
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

        return start
    }

    private fun findFloor(arr: IntArray, target: Int): Int {
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

        return end
    }
}