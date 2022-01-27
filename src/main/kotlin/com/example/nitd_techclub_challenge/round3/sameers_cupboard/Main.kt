package com.example.nitd_techclub_challenge.round3.sameers_cupboard

fun main() {
    val inp = readLine()!!.split(" ").map { it.toLong() }
    val a = maxOf(inp[0], inp[1])
    val b = minOf(inp[0], inp[1])

    val factors = mutableListOf<Long>()

    for (i in 2..b) {
        if (a % i == 0L && b % i == 0L) {
            factors.add(i)
        }
    }

    var start = 0
    var result = 2

    var count = 1

    for (i in 1..factors.lastIndex) {
        for (j in start until i) {
            if (factors[i] % factors[j] == 0L) {
                if (start == 0) count += 1
                start = i - 1
                if (count > result) result = count
                count = 1
                break
            }
            count += 1
        }
    }

    print(result)
}