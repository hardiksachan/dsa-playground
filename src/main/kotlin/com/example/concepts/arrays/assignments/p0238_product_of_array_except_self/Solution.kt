package com.example.concepts.arrays.assignments.p0238_product_of_array_except_self

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val copy = nums.clone()

        (1..nums.lastIndex).forEach { i ->
            nums[i] *= nums[i - 1]
            copy[copy.lastIndex - i] *= copy[copy.lastIndex - i + 1]
        }

        copy[0] = copy[1]

        (1 until nums.lastIndex).forEach { i ->
            copy[i] = copy[i + 1] * nums[i - 1]
        }

        copy[copy.lastIndex] = nums[nums.lastIndex - 1]
        return copy
    }
}

fun main() {
    println(
        Solution().productExceptSelf(
            intArrayOf(4, 3, 2, 1, 2)
        ).contentToString()
    )
}