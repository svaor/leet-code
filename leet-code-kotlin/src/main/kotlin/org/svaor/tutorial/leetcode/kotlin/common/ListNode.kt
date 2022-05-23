package org.svaor.tutorial.leetcode.kotlin.common

class ListNode {
    var value = 0
    var next: ListNode? = null

    constructor() {}
    constructor(value: Int) {
        this.value = value
    }

    constructor(value: Int, next: ListNode?) {
        this.value = value
        this.next = next
    }

    override fun toString(): String {
        val result = StringBuilder("" + value)
        var current = next
        while (current != null) {
            result
                .append(", ")
                .append(current.value)

            current = current.next
        }
        return result.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }

        other as ListNode

        if (value != other.value) {
            return false
        }
        if (next != other.next) {
            return false
        }

        return true
    }

    override fun hashCode(): Int {
        var result = value
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}
