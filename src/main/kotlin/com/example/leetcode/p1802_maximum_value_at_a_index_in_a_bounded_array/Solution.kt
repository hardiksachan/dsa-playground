package com.example.leetcode.p1802_maximum_value_at_a_index_in_a_bounded_array


/* Some observations
 *  - Under given conditions, array must have one peak,
 *    and difference b/w them must be <= 1.
 *  - An example array might look like: [1, 1, 2, 3, 2, 1, 1, 1]
 */

class Solution {
    fun maxValue(
        n: Int,
        index: Int,
        maxSum: Int
    ): Int {
        // Doing a binary search for max element
        var start = 1
        var end = maxSum

        while (start <= end) {
            val mid = start + (end - start) / 2
            val s = sumFor(n, index, mid.toLong())
            if (s == maxSum.toLong()) {
                return mid
            } else if (s < maxSum) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return end
    }

    private fun sumFor(
        n: Int,
        index: Int,
        maxElement: Long
    ): Long {
        val sumTillMax = sum(maxElement)

        // left side
        val sizeL = index + 1
        var sumL = sumTillMax
        if (sizeL > maxElement) {
            sumL += sizeL - maxElement
        } else if (sizeL < maxElement) {
            sumL -= sum(maxElement - sizeL)
        }

        // right side
        val sizeR = n - index
        var sumR = sumTillMax
        if (sizeR > maxElement) {
            sumR += sizeR - maxElement
        } else if (sizeR < maxElement) {
            sumR -= sum(maxElement - sizeR)
        }

        return (sumL + sumR - maxElement)
    }

    private fun sum(n: Long) = (n * (n + 1) / 2)
}

fun main() {
    println(
        Solution().maxValue(4, 0,4)
    )
}