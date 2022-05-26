package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0002

import org.svaor.tutorial.leetcode.kotlin.common.ListNode

class AddTwoNumbers {
    fun addTwoNumbers(list1Number: ListNode?, list2Number: ListNode?): ListNode? {
        if (list1Number == null || list2Number == null) {
            return null
        }

        var curList1Number = list1Number
        var curList2Number = list2Number
        var digit1 = curList1Number.value
        var digit2 = curList2Number.value
        var sum = digit1 + digit2
        var nextDigit = sum / 10
        val result = ListNode(sum % 10)
        var curListNode: ListNode? = result
        while (curList1Number?.next != null || curList2Number?.next != null) {
            curList1Number = curList1Number?.next
            curList2Number = curList2Number?.next
            digit1 = curList1Number?.value ?: 0
            digit2 = curList2Number?.value ?: 0
            sum = digit1 + digit2 + nextDigit
            nextDigit = sum / 10
            curListNode?.next = ListNode(sum % 10)
            curListNode = curListNode?.next
        }
        if (nextDigit != 0) {
            curListNode?.next = ListNode(nextDigit)
        }

        return result
    }
}
