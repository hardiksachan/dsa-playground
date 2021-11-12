package com.example.concepts.arrays

import java.util.*

class MultiDimension {
    fun main() {
        /*
            1   2   3
            4   5   6
            7   8   9
         */

//        val matrix = arrayOf(
//            arrayOf(1, 2, 3),
//            arrayOf(4, 5, 6),
//            arrayOf(7, 8, 9)
//        )
//
//        matrix.print()
//
//        val nonSquare = arrayOf(
//            arrayOf(1, 2, 3),
//            arrayOf(4, 5),
//            arrayOf(6, 7, 8, 9)
//        )
//        nonSquare.print()

        //? Input
        val arr = with(Scanner(System.`in`)) {
            Array(3) {
                Array(2) {
                    nextInt()
                }
            }
        }

        arr.print()

        // Another way to print
        println(arr.contentDeepToString())
    }

    fun Array<Array<Int>>.print() {
        this.forEach { arr ->
            arr.forEach {
                print("$it ")
            }
            println()
        }
    }
}