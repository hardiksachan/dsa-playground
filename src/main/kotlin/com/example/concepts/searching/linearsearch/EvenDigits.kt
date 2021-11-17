package com.example.concepts.searching.linearsearch

import kotlin.math.absoluteValue
import kotlin.math.log10

class EvenDigits {
    fun execute(nums: IntArray) : Int {
        var count = 0
        nums.forEach {
            if (log10(it.toDouble().absoluteValue).toInt() % 2 != 0) count++
        }
        return count
    }
}