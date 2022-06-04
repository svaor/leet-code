package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0019

import org.svaor.tutorial.leetcode.kotlin.common.ListNode

class RemoveNthNodeFromEndOfList {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null || n <= 0) {
            return null
        }

        // iterate from fake 0th node ("node before remove" in common case)
        var curNode: ListNode? = ListNode(0, head)
        // delay to find node at the end of linked list
        var indexDelay = -n - 1
        var nodeBeforeRemove: ListNode? = curNode
        while (curNode != null) {
            if (indexDelay == 0) {
                // after n + 1 nodes begin to iterate from fake head
                nodeBeforeRemove = nodeBeforeRemove?.next
            } else {
                // skipping n + 1 nodes
                indexDelay++
            }

            curNode = curNode.next
        }

        if (nodeBeforeRemove?.next == head) {
            // or remove first element, or remove single element
            return head.next
        }

        // remove nth element
        nodeBeforeRemove?.next = nodeBeforeRemove?.next?.next

        return head
    }
}
