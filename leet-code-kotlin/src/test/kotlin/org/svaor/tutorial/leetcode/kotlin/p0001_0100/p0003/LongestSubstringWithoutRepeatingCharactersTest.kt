package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0003

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate
import kotlin.system.measureTimeMillis

internal class LongestSubstringWithoutRepeatingCharactersTest {
    private val log by LoggerDelegate()

    @Test
    fun lengthOfLongestSubstring() {
        val lswrc = LongestSubstringWithoutRepeatingCharacters()

        val time = measureTimeMillis {
            assertThat(lswrc.lengthOfLongestSubstring("abcabcbb"), equalTo(3))
            assertThat(lswrc.lengthOfLongestSubstring("bbbbb"), equalTo(1))
            assertThat(lswrc.lengthOfLongestSubstring("pwwkew"), equalTo(3))
            assertThat(lswrc.lengthOfLongestSubstring("aab"), equalTo(2))
            assertThat(lswrc.lengthOfLongestSubstring("dvdf"), equalTo(3))
            assertThat(lswrc.lengthOfLongestSubstring("abcamnijabxyzzz"), equalTo(9))
            assertThat(lswrc.lengthOfLongestSubstring(""), equalTo(0))
            assertThat(lswrc.lengthOfLongestSubstring("a"), equalTo(1))
        }
        log.info("Time for 8 tests: {}ms", time)
    }
}
