package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0022

class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        if (n == 0) {
            return listOf()
        }

        val result = mutableListOf<String>()
        val combination = StringBuilder("")

        findCombination(n, n, combination, result)

        return result
    }

    private fun findCombination(toOpen: Int, toClose: Int, combination: StringBuilder, result: MutableList<String>) {
        if (toClose == 0) {
            result.add(combination.toString())
            return
        }

        if (toOpen > 0) {
            combination.append("(")
            findCombination(toOpen - 1, toClose, combination, result)
            combination.deleteCharAt(combination.length - 1)
        }

        if (toClose > 0 && toClose > toOpen) {
            combination.append(")")
            findCombination(toOpen, toClose - 1, combination, result)
            combination.deleteCharAt(combination.length - 1)
        }
    }
}
