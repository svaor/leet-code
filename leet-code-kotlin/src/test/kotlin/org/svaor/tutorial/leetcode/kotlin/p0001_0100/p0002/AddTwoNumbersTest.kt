package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0002

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

import org.svaor.tutorial.leetcode.kotlin.common.ListNodeUtils.Companion.from

internal class AddTwoNumbersTest {
    @Test
    fun addTwoNumbers() {
        val atn = AddTwoNumbers()

        var result = atn.addTwoNumbers(from(2, 4, 3), from(5, 6, 4))
        assertThat(result, equalTo(from(7, 0, 8)))
        result = atn.addTwoNumbers(from(0), from(0))
        assertThat(result, equalTo(from(0)))
        result = atn.addTwoNumbers(from(9, 9, 9, 9, 9, 9, 9), from(9, 9, 9, 9))
        assertThat(result, equalTo(from(8, 9, 9, 9, 0, 0, 0, 1)))
    }
}
