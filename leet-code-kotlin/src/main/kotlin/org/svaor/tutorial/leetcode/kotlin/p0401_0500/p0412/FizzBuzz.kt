package org.svaor.tutorial.leetcode.kotlin.p0401_0500.p0412

import java.util.*

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val result: MutableList<String> = LinkedList()
        for (i in 1..n) {
            val i3 = i % 3
            val i5 = i % 5
            if (i3 == 0 && i5 == 0) {
                result.add("FizzBuzz")
            } else if (i3 == 0) {
                result.add("Fizz")
            } else if (i5 == 0) {
                result.add("Buzz")
            } else {
                result.add(i.toString())
            }
        }
        return result
    }
}
