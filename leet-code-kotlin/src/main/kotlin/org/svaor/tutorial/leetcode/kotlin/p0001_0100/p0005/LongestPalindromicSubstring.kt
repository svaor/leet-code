package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0005

import kotlin.math.min

class LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        if (s.length <= 1) {
            return s
        }

        val len: Int = s.length
        var longestPalindromeStart = 0
        var longestPalindromeLength = 1
        val state = Array(len) { BooleanArray(len) }

        // base
        for (i in 0 until len) {
            state[i][i] = true
        }

        for (i in len - 2 downTo 0) {
            for (dist in 1 until len - i) {
                val j = dist + i
                state[i][j] = if (dist == 1) {
                    s[i] == s[j]
                } else {
                    s[i] == s[j] && state[i + 1][j - 1]
                }
                if (state[i][j] && j - i + 1 > longestPalindromeLength) {
                    longestPalindromeLength = j - i + 1
                    longestPalindromeStart = i
                }
            }
        }

        return s.substring(longestPalindromeStart until longestPalindromeStart + longestPalindromeLength)
    }

    // rather slow in leetcore test cases
    @Suppress("unused")
    fun longestPalindromeExpandVersion(s: String): String {
        // start values
        var longestPalindrome = s[0].toString()
        var maxLength = 1

        // iterate every char
        for (i in s.indices) {
            // test palindrome with 1 char in center
            val palindrome1 = expandAround(s, i, i)
            if (palindrome1.length > maxLength) {
                maxLength = palindrome1.length
                longestPalindrome = palindrome1
            }

            // test palindrome with 2 chars in center
            val palindrome2 = if (i + 1 != s.length && s[i] == s[i + 1])
                expandAround(s, i, i + 1)
            else
                ""
            if (palindrome2.length > maxLength) {
                maxLength = palindrome2.length
                longestPalindrome = palindrome2
            }
        }

        return longestPalindrome
    }

    private fun expandAround(s: String, left: Int, right: Int): String {
        val center = s[left]
        var (length, palindrome) = if (left == right)
            1 to "" + center
        else
            2 to "" + center + center

        for (j in 1..min(s.length - right - 1, left)) {
            if (s[left - j] == s[right + j]) {
                length++
                palindrome = s[left - j] + palindrome + s[right + j]
            } else {
                break
            }
        }
        return palindrome
    }
}
