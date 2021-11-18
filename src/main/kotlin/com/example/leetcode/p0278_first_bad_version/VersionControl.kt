package com.example.leetcode.p0278_first_bad_version

abstract class VersionControl() {
    private val firstBadVersion: Int = 4

    abstract fun firstBadVersion(n: Int): Int

    protected fun isBadVersion(version: Int) = version >= firstBadVersion
}