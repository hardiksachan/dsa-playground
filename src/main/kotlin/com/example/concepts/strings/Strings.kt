package com.example.concepts.strings

fun main() {
    val a = "Hardik"
    var b = "Hardik"

    // String Pool
    println(System.identityHashCode(a))
    println(System.identityHashCode(b))

    b = "Sachan"

    println(System.identityHashCode(b))
}