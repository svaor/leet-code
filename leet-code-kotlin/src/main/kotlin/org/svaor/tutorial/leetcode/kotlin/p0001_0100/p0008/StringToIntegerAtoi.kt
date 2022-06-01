package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0008

import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE

class StringToIntegerAtoi {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        var counter = 0
        while (counter < s.length && s[counter].isWhitespace()) {
            counter++
        }

        if (counter == s.length) {
            return 0
        }

        val sign = if (s[counter] == '-') -1 else 1
        if (s[counter] == '+' || s[counter] == '-') {
            counter++
        }

        var result = 0
        while (counter < s.length && s[counter].isDigit()) {
            val digit = s[counter] - '0'
            val newValue = result * 10 + digit
            if (wasOverflow(result) { (newValue - digit) / 10 }) {
                return erroneousResult(sign)
            }
            result = newValue
            counter++
        }

        if (result < 0) {
            return erroneousResult(sign)
        }
        val value = result * sign
        if (wasOverflow(result) { value / sign } ) {
            return erroneousResult(sign)
        }

        return value
    }

    private fun wasOverflow(result: Int, revert: () -> Int): Boolean {
        val reverted = revert()
        return result != reverted
    }

    private fun erroneousResult(sign: Int): Int {
        return if (sign == -1) {
            MIN_VALUE
        } else {
            MAX_VALUE
        }
    }
}
