package com.example.concepts.sorting.selectionsort

fun main() {
    val arr = intArrayOf(5, 4, 3, 2, 1)
    selectionSort(arr)
    println(arr.contentToString())
}

fun selectionSort(arr: IntArray) {
    (arr.lastIndex downTo 1).forEach { i ->
        var maxIdx = 0
        (1..i).forEach { j ->
            if (arr[j] > arr[maxIdx]) maxIdx = j
        }

        val t = arr[i]
        arr[i] = arr[maxIdx]
        arr[maxIdx] = t
    }
}