package com.example.concepts.binarysearch.questions

class FirstAndLastPosOfElInSortedArr {
    fun main() {
        println(
            searchRange(
                intArrayOf(5, 7, 7, 8, 8, 10),
                8
            )
        )
    }

    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)

        val s = searchFirst(nums, target)
        if (s == -1) return intArrayOf(-1, -1)
        val e = searchLast(nums, target)
        return intArrayOf(s, e)
    }

    private fun searchFirst(
        nums: IntArray,
        target: Int
    ): Int {
        var start = 0
        var end = nums.lastIndex

        while (end >= start) {
            val mid = (start + end) / 2

            if (nums[mid] >= target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return if (start in nums.indices && nums[start] == target) start else -1
    }

    private fun searchLast(
        nums: IntArray,
        target: Int
    ): Int {
        var start = 0
        var end = nums.lastIndex

        while (end >= start) {
            val mid = (start + end) / 2

            if (nums[mid] <= target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return if (end in nums.indices && nums[end] == target) end else -1
    }
}