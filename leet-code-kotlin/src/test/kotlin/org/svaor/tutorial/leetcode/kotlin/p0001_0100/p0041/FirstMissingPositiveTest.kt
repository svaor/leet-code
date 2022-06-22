package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0041

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class FirstMissingPositiveTest {
    private val t = FirstMissingPositive()

    @Test
    fun firstMissingPositive() {
        assertThat(t.firstMissingPositive(intArrayOf(1, 2, 0)), equalTo(3))
        assertThat(t.firstMissingPositive(intArrayOf(3, 1, 2)), equalTo(4))
        assertThat(t.firstMissingPositive(intArrayOf(3, 4, -1, 1)), equalTo(2))
        assertThat(t.firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)), equalTo(1))
        assertThat(t.firstMissingPositive(intArrayOf(1, 1)), equalTo(2))
    }
}
