package org.svaor.tutorial.leetcode.kotlin.p0801_0900.p876

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNode
import org.svaor.tutorial.leetcode.kotlin.common.ListNodeUtils.Companion.from
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class MiddleOfLinkedListTest {
    private val log by LoggerDelegate()

    @Test
    fun middleNode() {
        val middleOfLinkedList = MiddleOfLinkedList()

        val sample1 = from(1, 2, 1)
        log.debug("Sample 1 (1, 2, 1): {}", sample1)
        assertThat(middleOfLinkedList.middleNode(sample1), equalTo(ListNode(2, ListNode(1))))
        val sample2 = from(1, 2, 2, 1)
        log.debug("Sample 2 (1, 2, 2, 1): {}", sample2)
        assertThat(middleOfLinkedList.middleNode(sample2), equalTo(ListNode(2, ListNode(1))))
        val sample3 = from(1, 2, 3, 4, 5)
        log.debug("Sample 2 (1, 2, 3, 4, 5): {}", sample3)
        assertThat(middleOfLinkedList.middleNode(sample3), equalTo(ListNode(3, ListNode(4, ListNode(5)))))
        val sample4 = from(1, 2, 3, 4, 5, 6)
        log.debug("Sample 2 (1, 2, 3, 4, 5, 6): {}", sample4)
        assertThat(middleOfLinkedList.middleNode(sample4), equalTo(ListNode(4, ListNode(5, ListNode(6)))))
    }
}
