package com.example.concepts.sorting.insertionsort

fun main() {
    val arr = intArrayOf(1, 2, 5, 4, 3, 6, 7, 8, 9, -5)
    insertionSort(arr)
    println(arr.contentToString())
}

fun insertionSort(arr: IntArray) {
    for (i in 0 until arr.lastIndex) {
        for (j in (i+1) downTo 1) {
            if (arr[j] >= arr[j-1]) break // this line decides asc or desc

            val t = arr[j]
            arr[j] = arr[j-1]
            arr[j-1] = t
        }
    }
}