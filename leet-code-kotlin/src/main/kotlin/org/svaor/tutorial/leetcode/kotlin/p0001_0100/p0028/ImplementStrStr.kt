package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0028

class ImplementStrStr {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }

        if (haystack.isEmpty()) {
            return -1
        }

        val needleLength = needle.length
        for (i in 0 .. haystack.length - needleLength) {
            val substring = haystack.substring(i, i + needleLength)
            if (substring == needle) {
                return i
            }
        }

        return -1
    }
}
