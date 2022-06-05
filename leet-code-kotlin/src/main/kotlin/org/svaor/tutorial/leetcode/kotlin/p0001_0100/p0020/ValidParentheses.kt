package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0020

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        if (s.length % 2 != 0) {
            return false
        }

        val brackets = mapOf(')' to '(', ']' to '[', '}' to '{')

        val curBrackets = LinkedList<Char>() // = mutableListOf(' ')
        curBrackets.add(' ')
        s.forEach { ch ->
            if (brackets.containsKey(ch)) {
                if (curBrackets.last() == brackets[ch]) {
                    curBrackets.removeAt(curBrackets.size - 1) //1.4: removeLast()
                } else {
                    return false
                }
            } else {
                curBrackets.add(ch)
            }
        }

        return curBrackets.size == 1
    }
}
