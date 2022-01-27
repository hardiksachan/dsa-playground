package com.example.nitd_techclub_challenge.health_checkup_arrangement

fun main() {
    val N = readLine()!!.toInt()
    val heights = readLine()!!.split(" ").map { it.toLong() }

    var result = 0L

    var maxYet = heights[0]

    for (height in heights) {
        if (height > maxYet) {
            maxYet = height
        }
        else {
            result += (maxYet - height)
        }
    }

    println(result)

}