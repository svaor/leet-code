package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0019

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNodeUtils.Companion.from

internal class RemoveNthNodeFromEndOfListTest {
    private val r = RemoveNthNodeFromEndOfList()

    @Test
    fun testRemoveMiddleElement() {
        assertThat(r.removeNthFromEnd(from(1, 2, 3, 4, 5), 2), equalTo(from(1, 2, 3, 5)))
    }

    @Test
    fun testRemoveSingleElement() {
        assertThat(r.removeNthFromEnd(from(1), 1), nullValue())
    }

    @Test
    fun testRemoveLastElement() {
        assertThat(r.removeNthFromEnd(from(1, 2), 1), equalTo(from(1)))
        assertThat(r.removeNthFromEnd(from(1, 2, 3, 4), 1), equalTo(from(1, 2, 3)))
    }

    @Test
    fun testRemoveFirstElement() {
        assertThat(r.removeNthFromEnd(from(1, 2), 2), equalTo(from(2)))
    }

    @Test
    fun testErroneous() {
        assertThat(r.removeNthFromEnd(from(1), 2), nullValue())
    }
}
