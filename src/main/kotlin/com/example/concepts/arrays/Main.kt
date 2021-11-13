package com.example.concepts.arrays

import java.util.*

fun main() {
    ArrayListExample().main()
}

//fun main() {
//    // syntax
//    val rnos: Array<Int> = arrayOf(23, 12, 45, 32, 15)
//
//    //? PLEASE NOTE:
//    //? In JVM, arrays are stored in heap, and there is no guarantee that
//    //? heap objects are stored in a continuous fashion.
//
//    println(rnos[0])
//
//    //? creating array with user input
//    val arr = Array(5) { readLine()!!.toInt() }
//    change(arr)
//    println(arr.contentToString())
//
////    val strs = Array(4) { readLine()!! }
////    strs[1] = "new"
////    println(strs.contentToString())
//}
//
//fun change(a: Array<Int>) {
//    a[0]=99
//}