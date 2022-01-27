package com.example.nitd_techclub_challenge.palindromic_integer

fun main() {
    val inp = readLine()!!.dropLastWhile { it == '0' }
    println(
        if (inp == inp.reversed())
            "Yes"
        else
            "No"
    )
}