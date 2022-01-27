package com.example.nitd_techclub_challenge.round3.beautiful_numbers_v


fun main() {
    val beautifulNumbers = constructBeautifulNumbers()
    val t = readLine()!!.dropLastWhile { c -> c == ' ' }.toInt()

    for (i in 0 until t) {
        testcase(beautifulNumbers)
    }
}

fun testcase(beautifulNumbers: List<Long>) {
    val n = readLine()!!.dropLastWhile { c -> c == ' ' }.toLong()
    println(beautifulNumbers.first{ it > n })
}

fun constructBeautifulNumbers(): List<Long> {
    val base = listOf(
        "122", "333",
        "4444", "1333",
        "55555", "14444", "33322",
        "666666", "155555", "122333",
        "7777777", "1666666", "5555522", "4444333",
        "88888888", "17777777", "22666666", "33355555", "44443331", "55555221"
    )

    val result = mutableSetOf<Long>()

    base.forEach {
        permute(it).forEach { num ->
            result.add(num.dropLastWhile { c -> c == ' ' }.toLong())
        }
    }

    return result.sorted()
}

fun permute(str: String): List<String> {
    return permute("", str, ArrayList())
}

private fun permute(prefix: String, str: String, permutations: MutableList<String>): List<String> {
    if (str.isNotEmpty()) {
        for (i in str.indices) {
            val newPrefix = String.format("%s%s", prefix, str[i])
            val strBeforeChar = str.substring(0, i)
            var strAfterChar = ""
            val isLastChar = i == str.length - 1
            if (!isLastChar) {
                strAfterChar = str.substring(i + 1)
            }
            val newString = String.format("%s%s", strBeforeChar, strAfterChar)
            permute(newPrefix, newString, permutations)
        }
    } else {
        permutations.add(prefix)
    }
    return permutations
}
