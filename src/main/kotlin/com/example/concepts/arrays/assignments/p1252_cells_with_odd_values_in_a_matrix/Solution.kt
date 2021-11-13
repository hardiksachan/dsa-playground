package com.example.concepts.arrays.assignments.p1252_cells_with_odd_values_in_a_matrix

class Solution {
    fun oddCells(m: Int, n: Int, indices: Array<IntArray>): Int {
        val nAxis = IntArray(n) { 0 }
        val mAxis = IntArray(m) { 0 }

        indices.forEach {
            val mi = it[0]
            val ni = it[1]
            nAxis[ni]++
            mAxis[mi]++
        }

        var mOdd = 0
        var nOdd = 0

        mAxis.forEach {
            if (it %2 != 0) mOdd++
        }

        nAxis.forEach {
            if (it %2 != 0) nOdd++
        }

        return (mOdd * (n-nOdd)) + (nOdd * (m-mOdd))
    }
}