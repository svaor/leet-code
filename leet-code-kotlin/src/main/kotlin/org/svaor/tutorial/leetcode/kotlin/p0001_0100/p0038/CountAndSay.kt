package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0038

class CountAndSay {
    fun countAndSay(n: Int): String {
        var sequence = StringBuilder("1")

        for (i in 1 until n) {
            sequence = step(sequence)
        }

        return sequence.toString()

//        return recur(StringBuilder("1"), n - 1)
    }

    private fun step(sequence: StringBuilder): StringBuilder {
        var charCount = 0
        var previousChar = ' '
        val newSequence = StringBuilder()
        sequence.forEach { c ->
            if (c == previousChar) {
                charCount++
            } else if (previousChar == ' ') {
                previousChar = c
                charCount++
            } else {
                newSequence.append(charCount).append(previousChar)
                previousChar = c
                charCount = 1
            }
        }
        newSequence.append(charCount).append(previousChar)

        return newSequence
    }

    @Suppress("unused")
    private tailrec fun recur(sequence: StringBuilder, count: Int): String {
        if (count == 0) {
            return sequence.toString()
        }

        val newSequence = step(sequence)

        return recur(newSequence, count - 1)
    }
}
