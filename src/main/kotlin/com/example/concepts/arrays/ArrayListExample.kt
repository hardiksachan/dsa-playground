package com.example.concepts.arrays

import java.util.*

class ArrayListExample {
    fun main() {
        // Syntax
        val list = arrayListOf<Int>()

//        list.add(5)
//        list.add(8)
//        list.add(6)
//        list.add(12)
//        list.add(9)
//
//        println(list.contains(12))
//        println(list.set(0, 99))
//
//        list.removeAt(2)
//

        with(Scanner(System.`in`)) {
            for (i in 0..4) {
                list.add(nextInt())
            }
        }

        list[1] = 5

        println(list)

    }
}