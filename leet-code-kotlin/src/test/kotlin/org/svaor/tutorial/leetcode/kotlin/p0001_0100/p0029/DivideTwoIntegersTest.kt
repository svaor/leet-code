package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0029

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class DivideTwoIntegersTest {
    private val t = DivideTwoIntegers()

    @Test
    fun testExamples() {
        assertThat(t.divide(10, 3), equalTo(3))
        assertThat(t.divide(7, -3), equalTo(-2))
        assertThat(t.divide(1, 1), equalTo(1))
    }

    @Test
    fun testBigValues() {
        assertThat(t.divide(-2147483648, -1), equalTo(2147483647))
        assertThat(t.divide(-2147483648, 1), equalTo(-2147483648))
        assertThat(t.divide(-2147483648, 2), equalTo(-1073741824))
        assertThat(t.divide(-2147483648, -3), equalTo(715827882))
        assertThat(t.divide(2147483647, 3), equalTo(715827882))
        assertThat(t.divide(-1010369383, -2147483648), equalTo(0))
        assertThat(t.divide(1100540749, -1090366779), equalTo(-1))
        assertThat(t.divide(-2147483648, -2147483648), equalTo(1))
    }
}
