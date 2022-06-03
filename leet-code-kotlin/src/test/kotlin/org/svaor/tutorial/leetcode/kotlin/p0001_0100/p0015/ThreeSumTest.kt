package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0015

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class ThreeSumTest {
    private val log by LoggerDelegate()

    private val ts = ThreeSum()

    @Test
    fun testEmpty() {
        val result1 = ts.threeSum(intArrayOf())
        log.debug("Result of []: {}", result1)
        assertThat(result1, empty())
        val result2 = ts.threeSum(intArrayOf(0))
        log.debug("Result of [0]: {}", result1)
        assertThat(result2, empty())
    }

    @Test
    fun testExamples() {
        val result = ts.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        log.debug("Result of [-1, 0, 1, 2, -1, -4]: {}", result)
        assertThat(
            result, containsInAnyOrder(
                containsInAnyOrder(-1, -1, 2),
                containsInAnyOrder(-1, 0, 1),
            )
        )
    }
}
