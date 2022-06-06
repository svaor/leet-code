package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0028

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class ImplementStrStrTest {
    private val t = ImplementStrStr()

    @Test
    fun testExistedSubstringInTheMiddle() {
        assertThat(t.strStr("hello", "ll"), equalTo(2))
    }

    @Test
    fun testExistedSubstringInTheEnd() {
        assertThat(t.strStr("hello", "lo"), equalTo(3))
    }

    @Test
    fun testExistedSubstringInTheBegin() {
        assertThat(t.strStr("hello", "he"), equalTo(0))
    }

    @Test
    fun testNonexistentSubstring() {
        assertThat(t.strStr("alphabet", "bla"), equalTo(-1))
    }

    @Test
    fun testEmptiness() {
        assertThat(t.strStr("aaa", ""), equalTo(0))
        assertThat(t.strStr("", ""), equalTo(0))
        assertThat(t.strStr("", "a"), equalTo(-1))
    }
}
