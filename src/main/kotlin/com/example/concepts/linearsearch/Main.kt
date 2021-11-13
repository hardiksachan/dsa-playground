package com.example.concepts.linearsearch

fun main() {

}

fun find(arr: Array<Int>, n: Int): Int {
    arr.forEachIndexed { idx, num ->
        if (num == n ) return idx
    }
    return -1
}