package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0007

import java.lang.Math.addExact
import java.lang.Math.multiplyExact
import kotlin.math.abs

class ReverseInteger {
    fun reverse(x: Int): Int {
        var result = 0
        var value = abs(x)
        try {
            while (value != 0) {
                result = addExact(multiplyExact(result, 10), value % 10)
                value /= 10
            }
        } catch (ae: ArithmeticException) {
            return 0
        }


        if (x < 0) {
            result *= -1
        }

        return result
    }
}
