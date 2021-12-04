package com.example.leetcode.p1491_average_salary_excluding_the_minimum_and_maximum_salary

class Solution {
    fun average(salaries: IntArray): Double {
        var sum = 0L

        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        for (salary in salaries) {
            sum += salary

            if (salary > max) max = salary
            if (salary < min) min = salary
        }

        return (sum - min - max) / (salaries.size.toDouble() - 2.0)
    }
}