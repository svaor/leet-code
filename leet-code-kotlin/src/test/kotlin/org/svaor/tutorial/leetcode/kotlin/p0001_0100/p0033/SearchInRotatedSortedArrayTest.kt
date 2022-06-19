package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0033

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class SearchInRotatedSortedArrayTest {
    private val t = SearchInRotatedSortedArray()

    @Test
    fun testOdd() {
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 0), equalTo(0))
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 7), equalTo(6))
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 2), equalTo(2))
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 3), equalTo(-1))
    }

    @Test
    fun testEven() {
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6), 0), equalTo(0))
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6), 6), equalTo(5))
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6), 2), equalTo(2))
        assertThat(t.search(intArrayOf(0, 1, 2, 4, 5, 6), 3), equalTo(-1))
    }

    @Test
    fun testShort() {
        assertThat(t.search(intArrayOf(1), 0), equalTo(-1))
        assertThat(t.search(intArrayOf(), 1), equalTo(-1))
        assertThat(t.search(intArrayOf(1), 1), equalTo(0))
        assertThat(t.search(intArrayOf(1, 2), 1), equalTo(0))
        assertThat(t.search(intArrayOf(1, 2), 2), equalTo(1))
        assertThat(t.search(intArrayOf(1, 3), 2), equalTo(-1))
        assertThat(t.search(intArrayOf(3, 1), 2), equalTo(-1))
    }

    @Test
    fun testRotatedOdd() {
        assertThat(t.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0), equalTo(4))
        assertThat(t.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 7), equalTo(3))
        assertThat(t.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 2), equalTo(6))
        assertThat(t.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3), equalTo(-1))
        assertThat(t.search(intArrayOf(5, 1, 3), 5), equalTo(0))
        assertThat(t.search(intArrayOf(3, 4, 5, 6, 7, 1, 2), 4), equalTo(1))
    }

    @Test
    fun testRotatedEven() {
        assertThat(t.search(intArrayOf(4, 5, 6, 0, 1, 2), 0), equalTo(3))
        assertThat(t.search(intArrayOf(4, 5, 6, 0, 1, 2), 6), equalTo(2))
        assertThat(t.search(intArrayOf(4, 5, 6, 0, 1, 2), 2), equalTo(5))
        assertThat(t.search(intArrayOf(4, 5, 6, 0, 1, 2), 3), equalTo(-1))
        assertThat(t.search(intArrayOf(4, 5, 6, 7, 8, 1, 2, 3), 8), equalTo(4))
    }
}
