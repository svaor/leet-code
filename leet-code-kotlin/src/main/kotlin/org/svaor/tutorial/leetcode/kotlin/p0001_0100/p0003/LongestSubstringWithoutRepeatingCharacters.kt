package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0003

import kotlin.math.max

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        val usedCharacters = mutableMapOf<Char, Int>() // letter -> last occurrence of letter
        var substringStart = 0
        val result = s.toCharArray()
            .mapIndexed { index, letter ->
                substringStart = max(usedCharacters[letter] ?: 0, substringStart)
                usedCharacters[letter] = index + 1
                index - substringStart
            }
            .maxOrNull() ?: 0
        return result + 1
    }
}
