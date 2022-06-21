package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0038

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class CountAndSayTest {
    private val t = CountAndSay()

    @Test
    fun countAndSay() {
        assertThat(t.countAndSay(1), equalTo("1"))
        assertThat(t.countAndSay(4), equalTo("1211"))
        assertThat(t.countAndSay(5), equalTo("111221"))
        assertThat(t.countAndSay(6), equalTo("312211"))
    }
}
