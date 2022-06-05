package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0021

import org.svaor.tutorial.leetcode.kotlin.common.ListNode
import kotlin.Int.Companion.MAX_VALUE

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var firstNode = list1
        var secondNode = list2

        val result = ListNode()
        var previousNode = result
        while (firstNode != null || secondNode != null) {
            if (firstNode != null && firstNode.value <= (secondNode?.value ?: MAX_VALUE)) {
                val newNode = ListNode()
                newNode.value = firstNode.value
                previousNode.next = newNode
                previousNode = newNode

                firstNode = firstNode.next
            }
            if (secondNode != null && secondNode.value <= (firstNode?.value ?: MAX_VALUE)) {
                val newNode = ListNode()
                newNode.value = secondNode.value
                previousNode.next = newNode
                previousNode = newNode

                secondNode = secondNode.next
            }
        }

        return result.next
    }
}
