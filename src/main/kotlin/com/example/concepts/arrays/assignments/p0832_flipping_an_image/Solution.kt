package com.example.concepts.arrays.assignments.p0832_flipping_an_image

class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        return Array(image.size) { row ->
            IntArray(image.size) { col ->
                invert(image[row][image.lastIndex - col])
            }
        }
    }

    private fun invert(n: Int) = 1 - n
}