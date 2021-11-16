package com.example.concepts.binarysearch.questions

class SmallestLetterGreaterThanTarget {
    fun nextGreatestLetter(
        letters: CharArray,
        target: Char
    ): Char {
        var start = 0
        var end = letters.lastIndex

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (letters[mid] <= target) {
                start = mid + 1
            }  else {
                end = mid - 1
            }
        }

        return letters[start % letters.size]
    }
}