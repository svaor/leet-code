package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0007

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

import kotlin.Int.Companion.MAX_VALUE

internal class ReverseIntegerTest {
    @Test
    fun reverse() {
        val ri = ReverseInteger()

        assertThat(ri.reverse(50), equalTo(5))
        assertThat(ri.reverse(100), equalTo(1))
        assertThat(ri.reverse(101), equalTo(101))
        assertThat(ri.reverse(123), equalTo(321))
        assertThat(ri.reverse(-123), equalTo(-321))
        assertThat(ri.reverse(120), equalTo(21))
        assertThat(ri.reverse(MAX_VALUE), equalTo(0))
        assertThat(ri.reverse(1534236469), equalTo(0))
    }
}
