package com.example.concepts.linearsearch

class MaxWealth {
    fun execute(accounts: Array<IntArray>): Int {
        var res = Int.MIN_VALUE
        accounts.forEach {
            val s = it.sum()
            if (s > res) res = s
        }
        return res
    }
}