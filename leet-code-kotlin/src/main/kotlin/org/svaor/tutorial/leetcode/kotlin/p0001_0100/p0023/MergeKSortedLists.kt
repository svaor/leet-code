package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0023

import org.svaor.tutorial.leetcode.kotlin.common.ListNode

class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }
        return mergeKLists(lists, 0, lists.size - 1)
    }

    private fun mergeKLists(lists: Array<ListNode?>, left: Int, right: Int): ListNode? {
        return if (right == left) {
            lists[left]
        } else {
            val middle = (left + right) / 2
            val leftNode = mergeKLists(lists, left, middle)
            val rightNode = mergeKLists(lists, middle + 1, right)
            mergeTwoLists(leftNode, rightNode)
        }
    }

    @Suppress("DuplicatedCode")
    private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var firstNode = list1
        var secondNode = list2

        val result = ListNode()
        var previousNode = result
        while (firstNode != null || secondNode != null) {
            if (firstNode != null && firstNode.value <= (secondNode?.value ?: Int.MAX_VALUE)) {
                val newNode = ListNode()
                newNode.value = firstNode.value
                previousNode.next = newNode
                previousNode = newNode

                firstNode = firstNode.next
            }
            if (secondNode != null && secondNode.value <= (firstNode?.value ?: Int.MAX_VALUE)) {
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
