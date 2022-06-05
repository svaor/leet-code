package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0020

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class ValidParenthesesTest {
    private val vp = ValidParentheses()

    @Test
    fun testExamples() {
        assertThat(vp.isValid("()"), equalTo(true))
        assertThat(vp.isValid("()[]{}"), equalTo(true))
        assertThat(vp.isValid("(]"), equalTo(false))
        assertThat(vp.isValid("([])"), equalTo(true))
    }

    @Test
    fun testErroneous() {
        assertThat(vp.isValid("("), equalTo(false))
        assertThat(vp.isValid("]"), equalTo(false))
        assertThat(vp.isValid("([)]"), equalTo(false))
    }
}
