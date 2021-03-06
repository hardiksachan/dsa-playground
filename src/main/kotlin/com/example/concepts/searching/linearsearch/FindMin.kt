package com.example.concepts.searching.linearsearch

class FindMin {
    fun min(arr: IntArray): Int {
        var res = Int.MAX_VALUE
        arr.forEach {
            if (it < res) res = it
        }
        return res
    }
}