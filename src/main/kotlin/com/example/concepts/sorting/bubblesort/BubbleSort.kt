package com.example.concepts.sorting.bubblesort

class BubbleSort {
    fun main() {
        val arr = intArrayOf(1, 2, 3, 4, 5).bubbleSorted()
        println(arr.contentToString())
    }

    private fun bubbleSort(arr: IntArray) {
        (arr.lastIndex downTo 1).forEach { i ->
            var swapped = false
            (0 until i).forEach { j ->
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1)
                    swapped = true
                }
            }
            if (!swapped) return
        }
    }


    private fun IntArray.bubbleSorted(): IntArray = this.also { bubbleSort(it) }

    private fun swap(arr: IntArray, u: Int, v: Int) {
        val t = arr[u]
        arr[u] = arr[v]
        arr[v] = t
    }
}