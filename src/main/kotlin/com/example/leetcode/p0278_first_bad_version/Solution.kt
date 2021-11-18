package com.example.leetcode.p0278_first_bad_version

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var start = 1
        var end = n

        while (start < end) {
            val mid = start + (end - start) / 2
            if (isBadVersion(mid)) {
                end = mid
            } else {
                start = mid + 1
            }
        }

        return end
    }
}