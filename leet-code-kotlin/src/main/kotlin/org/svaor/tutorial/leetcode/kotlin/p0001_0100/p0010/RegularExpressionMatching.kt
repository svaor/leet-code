package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0010

class RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        val rows: Int = s.length
        val columns: Int = p.length
        // empty strings
        if (rows == 0 && columns == 0) {
            return true
        }

        // no pattern and string is not empty
        if (columns == 0) {
            return false
        }

        val dp = Array(rows + 1) { BooleanArray(columns + 1) }
        dp[0][0] = true

        // pattern '*' for empty string (first row)
        for (curColumn in 2..columns) {
            if (p[curColumn - 1] == '*') {
                dp[0][curColumn] = dp[0][curColumn - 2]
            }
        }

        for (curRow in 1..rows) {
            for (curColumn in 1..columns) {
                var value = false
                // letters are equal or patter symbol is '.' => current match = previous symbol match
                if (s[curRow - 1] == p[curColumn - 1] || p[curColumn - 1] == '.') {
                    value = dp[curRow - 1][curColumn - 1]
                }

                // pattern '*' for second column and further ('*' can not be first)
                if (curColumn > 1 && p[curColumn - 1] == '*') {
                    // => '*' can match empty string
                    value = dp[curRow][curColumn - 2]
                    // pattern symbol before '*' is '.' or equals string symbol
                    if (p[curColumn - 2] == '.' || p[curColumn - 2] == s[curRow - 1]) {
                        // => '*' can match many previous symbols
                        value = value or dp[curRow - 1][curColumn]
                    }
                }

                dp[curRow][curColumn] = value
            }
        }

        return dp[rows][columns]
    }
}
