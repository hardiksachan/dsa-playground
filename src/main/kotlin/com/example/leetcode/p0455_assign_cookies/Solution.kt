package com.example.leetcode.p0455_assign_cookies

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sortDescending()
        s.sortDescending()

        var contentChildren = 0

        var i = 0
        var j = 0

        while (i < g.size && j < s.size) {
            if (s[j] >= g[i]) {
                contentChildren++
                j++
            }
            i++
        }

        return contentChildren
    }
}