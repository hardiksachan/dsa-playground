package com.example.nitd_techclub_challenge.round3.more_candies

fun main() {
    val inp = readLine()!!.split(" ").map { it.toLong() }
    val n = inp[0]
    val k = inp[1]

    if (n % k == 0L) {
        println(0)
        return
    }

    print(1)
}