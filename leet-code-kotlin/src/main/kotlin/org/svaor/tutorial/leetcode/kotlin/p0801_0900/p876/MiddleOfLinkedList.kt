package org.svaor.tutorial.leetcode.kotlin.p0801_0900.p876

import org.svaor.tutorial.leetcode.kotlin.common.ListNode

class MiddleOfLinkedList {
    fun middleNode(head: ListNode): ListNode {
        var slow: ListNode? = head
        var fast: ListNode? = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
        }

        return slow!!
    }
}
