package com.example.leetcode.add_two_numbers

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0

        fun getAndResetCarry(): Int {
            val c = carry
            carry = 0
            return c
        }

        fun takeCarry(n: Int): Int {
            val tens = n / 10
            val ones = n % 10

            carry = tens

            return ones
        }

        val sum = ListNode(takeCarry(l1!!.`val` + l2!!.`val` + getAndResetCarry()))

        var digit2 = l2.next
        var digit1 = l1.next
        var nodeSum: ListNode = sum

        while (true) {
            if (digit1 == null && digit2 == null) {
                if (carry == 0) {
                    break
                } else {
                    val pairSum = getAndResetCarry()

                    nodeSum.next = ListNode(takeCarry(pairSum))
                    nodeSum = nodeSum.next!!
                }
            } else if (digit1 == null && digit2 != null) {
                val pairSum = digit2.`val` + getAndResetCarry()

                nodeSum.next = ListNode(takeCarry(pairSum))
                nodeSum = nodeSum.next!!

                digit2 = digit2.next
            } else if (digit1 != null && digit2 == null) {
                val pairSum = digit1.`val` + getAndResetCarry()

                nodeSum.next = ListNode(takeCarry(pairSum))
                nodeSum = nodeSum.next!!

                digit1 = digit1.next
            } else if (digit1 != null && digit2 != null) {
                val pairSum = digit1.`val` + digit2.`val` + getAndResetCarry()

                nodeSum.next = ListNode(takeCarry(pairSum))
                nodeSum = nodeSum.next!!

                digit2 = digit2.next
                digit1 = digit1.next
            }
        }

        return sum
    }
}

fun main() {
    val l1 = ListNode(9).addNext(
        ListNode(9).addNext(
            ListNode(9).addNext(
                ListNode(9).addNext(
                    ListNode(9).addNext(
                        ListNode(9).addNext(ListNode(9))
                    )
                )
            )
        )
    )
    val l2 = ListNode(9).addNext(ListNode(9).addNext(ListNode(9).addNext(ListNode(9))))

    println(
        Solution().addTwoNumbers(
            l1,
            l2
        )
    )
}