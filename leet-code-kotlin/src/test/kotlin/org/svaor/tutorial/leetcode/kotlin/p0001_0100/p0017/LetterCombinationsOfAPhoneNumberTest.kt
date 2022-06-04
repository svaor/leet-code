package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0017

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class LetterCombinationsOfAPhoneNumberTest {
    private val log by LoggerDelegate()

    private val lc = LetterCombinationsOfAPhoneNumber()

    @Test
    fun testEmpty() {
        val result = lc.letterCombinations("")
        log.debug("Result: {}", result)
        assertThat(result, equalTo(emptyList()))
    }

    @Test
    fun testExamples() {
        val result1 = lc.letterCombinations("23")
        assertThat(result1, containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        log.debug("Result: {}", result1)

        val result2 = lc.letterCombinations("2")
        assertThat(result2, containsInAnyOrder("a", "b", "c"))
        log.debug("Result: {}", result2)

        val result3 = lc.letterCombinations("864")
        assertThat(result3, containsInAnyOrder(
            "tmg", "tmh", "tmi", "tng", "tnh", "tni", "tog", "toh", "toi",
            "umg", "umh", "umi", "ung", "unh", "uni", "uog", "uoh", "uoi",
            "vmg", "vmh", "vmi", "vng", "vnh", "vni", "vog", "voh", "voi",
        ))
        log.debug("Result: {}", result3)
    }
}
