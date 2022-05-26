package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0001

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class TwoSumTest {
    private val log by LoggerDelegate()

    @Test
    fun twoSum() {
        val twoSum = TwoSum()

        val sample1 = intArrayOf(2, 7, 11, 15)
        val result1 = twoSum.twoSum(sample1, 9)
        log.debug("Sample: {}, result: {}", sample1, result1)
        assertThat(result1, equalTo(intArrayOf(0, 1)))

        val sample2 = intArrayOf(3, 2, 4)
        val result2 = twoSum.twoSum(sample2, 6)
        log.debug("Sample: {}, result: {}", sample2, result2)
        assertThat(result2, equalTo(intArrayOf(1, 2)))

        val sample3 = intArrayOf(3, 3)
        val result3 = twoSum.twoSum(sample3, 6)
        log.debug("Sample: {}, result: {}", sample3, result3)
        assertThat(result3, equalTo(intArrayOf(0, 1)))
    }
}