package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0011

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class ContainerWithMostWaterTest {
    val c = ContainerWithMostWater()

    @Test
    fun maxAreaOfEmptyContainer() {
        assertThat(c.maxArea(intArrayOf()), equalTo(0))
    }

    @Test
    fun maxAreaExample1() {
        assertThat(c.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)), equalTo(49))
    }

    @Test
    fun maxAreaExample2() {
        assertThat(c.maxArea(intArrayOf(1, 1)), equalTo(1))
    }

    @Test
    fun maxAreaExample3() {
        assertThat(c.maxArea(intArrayOf(3, 9, 3, 4, 7, 2, 12, 6)), equalTo(45))
    }

    @Test
    fun maxAreaExample6() {
        assertThat(c.maxArea(intArrayOf(1, 5, 4, 3)), equalTo(6))
    }

    @Test
    fun maxAreaExample7() {
        assertThat(c.maxArea(intArrayOf(3, 1, 2, 4, 5)), equalTo(12))
    }
}
