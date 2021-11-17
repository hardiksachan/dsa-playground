package com.example.concepts.searching.linearsearch

fun main() {
    println(
        EvenDigits().execute(
            intArrayOf(1, 11, 111, 1111, -11)
        )
    )
}

fun find(arr: Array<Int>, n: Int): Int {
    arr.forEachIndexed { idx, num ->
        if (num == n) return idx
    }
    return -1
}

fun exists(arr: Array<Int>, n: Int): Boolean {
    arr.forEachIndexed { idx, num ->
        if (num == n) return true
    }
    return false
}