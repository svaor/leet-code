package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0022

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.hamcrest.Matchers.empty
import org.junit.jupiter.api.Test

internal class GenerateParenthesesTest {
    private val t = GenerateParentheses()

    @Test
    fun generateParenthesis() {
        assertThat(t.generateParenthesis(0), empty())
        assertThat(t.generateParenthesis(1), containsInAnyOrder("()"))
        assertThat(t.generateParenthesis(2), containsInAnyOrder("()()", "(())"))
        assertThat(t.generateParenthesis(3), containsInAnyOrder("((()))", "(()())", "()(())", "()()()", "(())()"))
    }
}
