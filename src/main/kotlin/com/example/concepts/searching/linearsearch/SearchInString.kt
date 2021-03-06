package com.example.concepts.searching.linearsearch

class SearchInString {

    fun search(str: String, target: Char): Boolean {
        if (str.isEmpty()) return false

        str.forEach {
            if (it == target) return true
        }

        return false
    }
}