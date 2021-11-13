package com.example.concepts.arrays

import java.util.*
import kotlin.collections.ArrayList

class MultiAL {
    fun main() {
        val list: ArrayList<ArrayList<Int>> = arrayListOf()

        with(Scanner(System.`in`)) {
            for(i in 0 until 3) {
                list.add(arrayListOf())

                // add elements
                for (j in 0 until 3) {
                    list[i].add(nextInt())
                }
            }
        }

        println(list)
    }
}