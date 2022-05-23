package org.svaor.tutorial.leetcode.kotlin.p0201_0300.p0234

import org.svaor.tutorial.leetcode.kotlin.common.ListNode

class IsPalindrome {
    fun isPalindrome(head: ListNode): Boolean {
        // find middle
        var slow: ListNode? = head
        var fast: ListNode? = head
        val odd: Boolean
        while (true) {
            if (fast?.next != null) {
                fast = fast.next!!.next
            } else {
                odd = fast != null
                break
            }
            slow = slow!!.next
        }
        if (odd) {
            slow = slow!!.next
        }

        //reverse second part
        var prev: ListNode? = null
        var current: ListNode? = slow
        var next: ListNode?
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        var secondPart: ListNode? = prev

        //compare two parts
        var firstPart: ListNode? = head
        while (secondPart != null) {
            if (secondPart.value != firstPart!!.value) {
                return false
            }
            firstPart = firstPart.next
            secondPart = secondPart.next
        }
        return true
    }
}
