package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0021

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNodeUtils.Companion.from

internal class MergeTwoSortedListsTest {
    private val t = MergeTwoSortedLists()

    @Test
    fun test() {
        assertThat(t.mergeTwoLists(from(1, 2, 4), from(1, 3, 4)), equalTo(from(1, 1, 2, 3, 4, 4)))
        assertThat(t.mergeTwoLists(from(1, 3, 4), from(1, 2, 4)), equalTo(from(1, 1, 2, 3, 4, 4)))
        assertThat(t.mergeTwoLists(null, null), equalTo(null))
        assertThat(t.mergeTwoLists(null, from(0)), equalTo(from(0)))
    }
}
