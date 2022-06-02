package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0010

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class RegularExpressionMatchingTest {
    val rem = RegularExpressionMatching()

    @Test
    fun isMatchComplex() {
        assertThat(rem.isMatch("limpopo", "b*l.*pol*po"), equalTo(true))
    }

    @Test
    fun isMatchExamples() {
        assertThat(rem.isMatch("aa", "a"), equalTo(false))
        assertThat(rem.isMatch("aa", "a*"), equalTo(true))
        assertThat(rem.isMatch("ab", ".*"), equalTo(true))

        assertThat(rem.isMatch("aab", "c*a*b"), equalTo(true))
        assertThat(rem.isMatch("mississippi", "mis*is*p*"), equalTo(false))
    }

    @Test
    fun isMatchEqualValues() {
        assertThat(rem.isMatch("aa", "aa"), equalTo(true))
    }

    @Test
    fun isMatchEmpty() {
        assertThat(rem.isMatch("", ""), equalTo(true))
        assertThat(rem.isMatch("", "a"), equalTo(false))
        assertThat(rem.isMatch("", ".*"), equalTo(true))
        assertThat(rem.isMatch("", "a*"), equalTo(true))
    }

    @Test
    fun isMatchTrail() {
        assertThat(rem.isMatch("aadd", ".*dd"), equalTo(true))
        assertThat(rem.isMatch("aaddd", ".*dd"), equalTo(true))
        assertThat(rem.isMatch("aadd", ".*ddd"), equalTo(false))
    }
}
