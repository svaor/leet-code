package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0023

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNodeUtils.Companion.from

internal class MergeKSortedListsTest {
    private val t = MergeKSortedLists()

    @Test
    fun testExample() {
        assertThat(
            t.mergeKLists(arrayOf(from(1, 4, 5), from(1, 3, 4), from(2, 6))),
            equalTo(from(1, 1, 2, 3, 4, 4, 5, 6))
        )
        assertThat(
            t.mergeKLists(arrayOf(null, from(-1, 5, 11), null, from(6, 10))),
            equalTo(from(-1, 5, 6, 10, 11))
        )
    }

    @Test
    fun testEmpty() {
        assertThat(t.mergeKLists(arrayOf()), equalTo(null))
        assertThat(t.mergeKLists(arrayOf(null)), equalTo(null))
        assertThat(t.mergeKLists(arrayOf(null, null)), equalTo(null))
    }
}
