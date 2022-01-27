package com.example.nitd_techclub_challenge.make_them_equal

fun main() {
    val T = readLine()!!.toInt()
    for (t in 0 until T) {
        testcase()
    }
}

fun testcase() {
    val N = readLine()!!.toInt()
    val K = readLine()!!.toInt()

    val str = readLine()!!.toCharArray()

    // Try flip
    for (i in 0 until N) {
        if (str[i] == '1') {
            if (i + K < N) {
                for (j in i..(i + K)) {
                    if (str[j] == '0') str[j] = '1' else str[j] = '0'
                }
            }
        }
    }


    // Check
    for (i in 0 until N) {
        if (str[i] == '1') {
            println(0)
            return
        }
    }

    println(1)
}