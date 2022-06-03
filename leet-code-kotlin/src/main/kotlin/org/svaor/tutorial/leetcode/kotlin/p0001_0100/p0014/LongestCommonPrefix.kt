package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0014

class LongestCommonPrefix {
    fun longestCommonPrefix(strings: Array<String>): String {
        if (strings.isEmpty()) {
            return ""
        }
        if (strings.size == 1) {
            return strings[0]
        }

        var candidate = strings[0]

        var i = 1

        while (candidate.isNotEmpty() && i < strings.size) {
            if (candidate.length > strings[i].length) {
                // crop candidate to current shorter string length
                candidate = candidate.substring(0, strings[i].length)
            }

            // current string cut to candidate length
            val cur = strings[i].substring(0, candidate.length)
            if (cur == candidate) {
                // candidate fully matches; get next string
                i++
            } else {
                // candidate not matches; crop last symbol
                candidate = candidate.substring(0, candidate.length - 1)
            }
        }

        return candidate
    }
}
