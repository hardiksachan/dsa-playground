package com.example.concepts.searching.binarysearch.questions

class PeakIndexInMountainArr {
    fun main() {
        println(
            peakIndexInMountainArray(
                intArrayOf(3, 5, 3, 2, 0)
            )
        )
    }

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 0
        var end = arr.lastIndex

        while (start < end) {
            val mid = start + (end - start) / 2

            if (arr[mid] < arr[mid+1]) {
                start = mid+1
            } else {
                end = mid
            }
        }

        return start
    }
}