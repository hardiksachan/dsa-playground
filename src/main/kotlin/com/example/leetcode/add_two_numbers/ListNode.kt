package com.example.leetcode.add_two_numbers

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
) {
    fun addNext(node: ListNode): ListNode {
        this.next = node
        return this
    }
}