package com.example.leetcode.p1854_maximum_population_year

class Solution {

    // Can be better. Optimize later!
    fun maximumPopulation(logs: Array<IntArray>): Int {
        val births = MutableList(101) { 0 } // list[0] -> year 1950
        val deaths = MutableList(101) { 0 } // list[0] -> year 1950


        logs.forEach { log ->
            births[log[0] - 1950]++
            deaths[log[1] - 1950]++
        }

        val population = MutableList(101) { 0 } // list[0] -> year 1950

        population[0] = births[0] - deaths[0]
        (1 until 101).forEach {
            population[it] = population[it - 1] + births[it] - deaths[it]
        }

        var maxPopulation = 0
        var ans = 1950

        population.forEachIndexed { shiftedYear, p ->
            if (p > maxPopulation) {
                ans = 1950 + shiftedYear
                maxPopulation = p
            }
        }

        return ans
    }
}