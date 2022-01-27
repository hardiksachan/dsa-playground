package com.example.nitd_techclub_challenge.round3.max_length_prefix

fun main() {
    val t = readLine()!!.toInt()

    for (i in 0 until t) {
        testcase()
    }
}

fun testcase() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val q = readLine()!!.toInt()
    val queries = readLine()!!.split(" ").map { it.toInt() }

    val results = mutableListOf<Int>()
    var start = 0
    for (query in queries) {

        if (query == 1) {
            start = if (start == 0) n - 1 else start - 1
        } else {
            var count = 0

            if (start == 0) {
                count = arr.takeWhile { it == 1 }.size
            } else {
                var i = start
                while (i < n) {
                    if (arr[i] == 1) {
                        count += 1
                    } else {
                        break
                    }
                    i++
                }

                if (i == n) {
                    i = 0
                    while (i < start) {
                        if (arr[i] == 1) {
                            count += 1
                        } else {
                            break
                        }
                        i++
                    }
                }
            }
            results.add(count)
        }
    }

    println(results.joinToString(" "))
}