package com.example.nitd_techclub_challenge.xor_operations

fun main() {
    val T = readLine()!!.toInt()

    for (t in 0 until T) {
        testcase()
    }
}

fun testcase() {
    val N = readLine()!!.toInt()

    val A = readLine()!!.split(" ").map { it.toInt() }

    val Q = readLine()!!.toInt()

    for (q in 0 until Q) {
        val inp = readLine()!!.split(" ").map { it.toInt() }
        val L = inp[0]
        val R = inp[1]
        solve(N, A, L, R)
    }

    println()
}

fun solve(n: Int, a: List<Int>, l: Int, r: Int) {
    val size = r - l + 1

    var operations = 0

    var maxInWindow = a[l]

    for (i in l..r) {
        if (a[i] > maxInWindow) maxInWindow = a[i]
    }

    val maxBits = Integer.toBinaryString(maxInWindow).length

    for (i in 0 until maxBits) {
        var toMakeAllOnes = 0

        for (j in l..r) {
            toMakeAllOnes += if (a[j] and (1 shl j) == 0) 0 else 1
        }

        operations += minOf(toMakeAllOnes, size - toMakeAllOnes)
    }

    print("$operations ")
}
