package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0017

class LetterCombinationsOfAPhoneNumber {
    companion object {
        val LETTERS = listOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    }

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }

        val result = mutableListOf<String>()
        val combination = StringBuilder()

        findCombination(digits, 0, combination, result)

        return result
    }

    private fun findCombination(digits: String, digitIndex: Int, combination: StringBuilder, result: MutableList<String>) {
        if (combination.length == digits.length) {
            result.add(combination.toString())
            return
        }

        val digit = digits[digitIndex] - '0'
        for (ch in LETTERS[digit]) {
            combination.append(ch)
            findCombination(digits, digitIndex + 1, combination, result)
            combination.deleteCharAt(combination.length - 1)
        }
    }
}
