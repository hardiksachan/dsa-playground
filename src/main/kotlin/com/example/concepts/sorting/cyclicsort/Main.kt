package com.example.concepts.sorting.cyclicsort

// Use cyclic sort when range is (1..N)

fun main() {
    val arr = intArrayOf(3, 5, 2, 1, 4)
    cyclicSort(arr)
    println(arr.contentToString())
}

// Sorted Array looks like: [1, 2, 3, 4, 5]
fun cyclicSort(arr: IntArray) {
    var i = 0
    while (i < arr.lastIndex) {
        if (i == arr[i] - 1) {
            i++
        } else {
            swap(arr, i, arr[i] - 1)
        }
    }
}

fun swap(arr: IntArray, u: Int, v: Int) {
    val t = arr[u]
    arr[u] = arr[v]
    arr[v] = t
}