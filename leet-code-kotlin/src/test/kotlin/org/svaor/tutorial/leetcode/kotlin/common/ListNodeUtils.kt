package org.svaor.tutorial.leetcode.kotlin.common

class ListNodeUtils {
    companion object {
        fun from(vararg num: Int): ListNode {
            var prevListNode: ListNode? = null
            val result = num.map {
                val node = ListNode(it)
                prevListNode?.next= node
                prevListNode = node
                node
            }
            return result.first()
        }
    }
}
