package org.svaor.tutorial.leetcode.kotlin.p1_100.p13

import org.svaor.tutorial.leetcode.kotlin.p1_100.p13.RomanToInteger.Roman.Companion.I
import org.svaor.tutorial.leetcode.kotlin.p1_100.p13.RomanToInteger.Roman.Companion.ROMANS

class RomanToInteger {
    fun romanToInt(romanNumber: String): Int {
        if (!validateRoman(romanNumber)) {
            return -1
        }

        var previous = I
        var result = 0
        for (i in romanNumber.length - 1 downTo 0) {
            val current = ROMANS[romanNumber[i]] ?: return -1
            if (current >= previous) {
                result += current.value
            } else {
                result -= current.value
            }
            previous = current
        }
        return result
    }

    private fun validateRoman(romanNumber: String): Boolean =
        romanNumber.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$".toRegex())

    internal class Roman private constructor(val value: Int) : Comparable<Roman> {
        override operator fun compareTo(other: Roman): Int {
            return value.compareTo(other.value)
        }

        companion object {
            val I = Roman(1)
            val V = Roman(5)
            val X = Roman(10)
            val L = Roman(50)
            val C = Roman(100)
            val D = Roman(500)
            val M = Roman(1000)

            val ROMANS: Map<Char, Roman> = mapOf('I' to I, 'V' to V, 'X' to X, 'L' to L, 'C' to C, 'D' to D, 'M' to M)
        }
    }
}
