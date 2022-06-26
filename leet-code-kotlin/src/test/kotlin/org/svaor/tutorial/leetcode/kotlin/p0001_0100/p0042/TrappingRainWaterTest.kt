package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0042

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class TrappingRainWaterTest {
    private val t = TrappingRainWater()

    @Test
    fun trap() {
        assertThat(t.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)), equalTo(6))
        assertThat(t.trap(intArrayOf(4, 2, 0, 3, 2, 5)), equalTo(9))
    }
}
