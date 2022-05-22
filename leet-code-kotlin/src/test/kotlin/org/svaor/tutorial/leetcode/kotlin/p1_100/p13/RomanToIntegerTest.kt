package org.svaor.tutorial.leetcode.kotlin.p1_100.p13

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RomanToIntegerTest {
    @Test
    fun romanToInt() {
        val romanToInteger = RomanToInteger()
        assertThat(romanToInteger.romanToInt("III"), equalTo(3))
        assertThat(romanToInteger.romanToInt("IV"), equalTo(4))
        assertThat(romanToInteger.romanToInt("IX"), equalTo(9))
        assertThat(romanToInteger.romanToInt("LVIII"), equalTo(58))
        assertThat(romanToInteger.romanToInt("MCMXCIV"), equalTo(1994))
    }

    @Test
    fun romanToIntErroneous() {
        val romanToInteger = RomanToInteger()
        assertThat(romanToInteger.romanToInt("IM"), equalTo(-1))
    }
}
