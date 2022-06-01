package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0008

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE

internal class StringToIntegerAtoiTest {
    val sti = StringToIntegerAtoi()

    @Test
    fun testAllWhitespaces() {
        assertThat(sti.myAtoi(""), equalTo(0))
        assertThat(sti.myAtoi("     \t  "), equalTo(0))
    }

    @Test
    fun testOnlySign() {
        assertThat(sti.myAtoi("     -"), equalTo(0))
        assertThat(sti.myAtoi("     +"), equalTo(0))
    }

    @Test
    fun testPositive() {
        assertThat(sti.myAtoi("     123"), equalTo(123))
        assertThat(sti.myAtoi("     +123"), equalTo(123))
        assertThat(sti.myAtoi("     0123"), equalTo(123))
    }

    @Test
    fun testNegative() {
        assertThat(sti.myAtoi("     -123"), equalTo(-123))
        assertThat(sti.myAtoi("     -0123"), equalTo(-123))
    }

    @Test
    fun testMinMax() {
        assertThat(sti.myAtoi("2147483658"), equalTo(MAX_VALUE))   // Int.MAX_VALUE + 11
        assertThat(sti.myAtoi("-2147483659"), equalTo(MIN_VALUE))  // Int.MIN_VALUE - 11
        assertThat(sti.myAtoi("-91283472332"), equalTo(MIN_VALUE)) // overflow to negative
        assertThat(sti.myAtoi("2147483648"), equalTo(MAX_VALUE))   // Int.MAX_VALUE + 1
        assertThat(sti.myAtoi("-2147483648"), equalTo(MIN_VALUE))  // Int.MIN_VALUE - 1
    }

    @Test
    fun testWords() {
        assertThat(sti.myAtoi("2 plus three"), equalTo(2))
    }
}
