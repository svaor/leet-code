package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0029

import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE
import kotlin.math.abs

class DivideTwoIntegers {
    fun divide(dividend: Int, divisor: Int): Int {
        if (dividend == MIN_VALUE) {
            if (divisor == -1) {
                return MAX_VALUE
            } else if (divisor == 1) {
                return MIN_VALUE
            }
        }
        if (divisor == MIN_VALUE) {
            return if (dividend == MIN_VALUE) 1 else 0
        }

        var answer = 0
        val divisorAbs = abs(divisor)
        var substractionResult = if (dividend == MIN_VALUE) {
            answer = 1
            MAX_VALUE - divisorAbs + 1
        } else {
            abs(dividend)
        }
        while (substractionResult >= divisorAbs) {
            var counterBig = 1
            var divisorBig = divisorAbs
            var i = 0
            while (substractionResult >= divisorBig && i < 30) {
                i++

                substractionResult -= divisorBig
                answer += counterBig
                counterBig = counterBig shl 1 // * 2
                val newDivisor = divisorBig shl 1
                if (newDivisor shr 1 == divisorBig) {
                    divisorBig = newDivisor
                } else {
                    break
                }
            }
        }

        return if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            -answer
        } else {
            answer
        }
    }
}
