package com.example.leetcode.p0088_merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n == 0) return

        val nums1Original = IntArray(m) { nums1[it] }

        val ans = merge(nums1Original, nums2)

        nums1.indices.forEach {
            nums1[it] = ans[it]
        }
    }

    private fun merge(nums1: IntArray, nums2: IntArray): IntArray {
        val merged = IntArray(nums1.size + nums2.size)

        var i = 0
        var j = 0
        var k = 0
        while (true) {
            if (i >= nums1.size && j < nums2.size) {
                merged[k] = nums2[j]
                j++
            } else if (i < nums1.size && j >= nums2.size) {
                merged[k] = nums1[i]
                i++
            } else if (k >= merged.size) {
                break
            } else {
                if (nums1[i] < nums2[j]) {
                    merged[k] = nums1[i]
                    i++
                } else {
                    merged[k] = nums2[j]
                    j++
                }
            }

            k++
        }

        return merged
    }
}

//    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
//        if (n == 0) return
//
//        var j = 0
//
//        while (j < n) {
//            var i = j + m
//            nums1[i] = nums2[j]
//            while (i > 0 && nums1[i] < nums1[i - 1]) {
//                swap(nums1, i, i - 1)
//                i--
//            }
//            j++
//        }
//    }
//
//    private fun swap(arr: IntArray, u: Int, v: Int) {
//        val t = arr[u]
//        arr[u] = arr[v]
//        arr[v] = t
//    }
