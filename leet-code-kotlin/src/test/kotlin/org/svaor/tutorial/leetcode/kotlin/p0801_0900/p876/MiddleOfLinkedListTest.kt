package org.svaor.tutorial.leetcode.kotlin.p0801_0900.p876

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNode
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class MiddleOfLinkedListTest {
    private val log by LoggerDelegate()

    @Test
    fun middleNode() {
        val middleOfLinkedList = MiddleOfLinkedList()

        val sample1 = ListNode(1, ListNode(2, ListNode(1)))
        log.debug("Sample 1 (1, 2, 1): {}", sample1)
        assertThat(middleOfLinkedList.middleNode(sample1), `is`(ListNode(2, ListNode(1))))
        val sample2 = ListNode(1, ListNode(2, ListNode(2, ListNode(1))))
        log.debug("Sample 2 (1, 2, 2, 1): {}", sample2)
        assertThat(middleOfLinkedList.middleNode(sample2), `is`(ListNode(2, ListNode(1))))
        val sample3 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        log.debug("Sample 2 (1, 2, 3, 4, 5): {}", sample3)
        assertThat(middleOfLinkedList.middleNode(sample3), `is`(ListNode(3, ListNode(4, ListNode(5)))))
        val sample4 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))
        log.debug("Sample 2 (1, 2, 3, 4, 5, 6): {}", sample4)
        assertThat(middleOfLinkedList.middleNode(sample4), `is`(ListNode(4, ListNode(5, ListNode(6)))))
    }
}
