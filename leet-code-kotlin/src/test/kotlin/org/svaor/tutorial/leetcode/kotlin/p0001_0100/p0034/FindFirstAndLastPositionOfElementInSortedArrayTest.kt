package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0034

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private val t = FindFirstAndLastPositionOfElementInSortedArray()

    @Test
    fun testExamples() {
        assertThat(t.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8), equalTo(intArrayOf(3, 4)))
        assertThat(t.searchRange(intArrayOf(5,7,7,8,8,10), 6), equalTo(intArrayOf(-1, -1)))
        assertThat(t.searchRange(intArrayOf(), 0), equalTo(intArrayOf(-1, -1)))
        assertThat(t.searchRange(intArrayOf(-1, 1, 2, 2, 2, 5, 6, 12, 12), 2), equalTo(intArrayOf(2, 4)))
        assertThat(t.searchRange(intArrayOf(0, 1, 2, 4, 5, 6), 0), equalTo(intArrayOf(0, 0)))
        assertThat(t.searchRange(intArrayOf(0, 1, 2, 4, 5, 6), 6), equalTo(intArrayOf(5, 5)))
        assertThat(t.searchRange(intArrayOf(0, 1, 2, 4, 5, 6), 2), equalTo(intArrayOf(2, 2)))
        assertThat(t.searchRange(intArrayOf(2, 2), 2), equalTo(intArrayOf(0, 1)))
    }
}
