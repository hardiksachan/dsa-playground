package com.example.concepts.arrays.assignments.p1832_check_if_the_sentence_is_pangram

class Solution {
    fun checkIfPangram(sentence: String): Boolean =
        sentence.split("").toSet().size == 27

    // Performs better. Why?
    fun checkIfPangram2(sentence: String): Boolean {
        val charSet = mutableSetOf<Char>()

        sentence.forEach {
            charSet.add(it)
        }

        return charSet.size == 26
    }
}

fun main() {
    println(Solution().checkIfPangram2("thequickbrownfoxjumpsoverthelazydog"))
}