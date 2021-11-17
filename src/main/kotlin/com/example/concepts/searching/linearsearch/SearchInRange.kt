package com.example.concepts.searching.linearsearch

class SearchInRange {
    fun search(arr: IntArray, start: Int, end: Int, target: Int): Int {
        try {
            (start..end).forEach {
                if (arr[it] == target) return it
            }
        }
        catch(e: IndexOutOfBoundsException) {
            return -1
        }

        return -1
    }
}