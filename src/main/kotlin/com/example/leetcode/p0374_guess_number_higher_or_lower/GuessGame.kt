package com.example.leetcode.p0374_guess_number_higher_or_lower

abstract class GuessGame {
    /**
     * The API guess is defined in the parent class.
     * @param  num   your guess
     * @return         -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     *               */
    protected abstract fun guess(num: Int): Int

    abstract fun guessNumber(n: Int): Int
}