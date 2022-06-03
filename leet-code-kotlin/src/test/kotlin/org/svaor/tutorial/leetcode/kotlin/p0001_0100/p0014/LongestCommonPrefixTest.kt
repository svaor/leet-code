package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0014

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class LongestCommonPrefixTest {
    private val t = LongestCommonPrefix()

    @Test
    fun testNoCommonPrefixes() {
        assertThat(t.longestCommonPrefix(arrayOf("dog", "racecar", "car")), equalTo(""))
    }

    @Test
    fun test() {
        assertThat(t.longestCommonPrefix(arrayOf("flower", "flow", "flight")), equalTo("fl"))
    }
}
