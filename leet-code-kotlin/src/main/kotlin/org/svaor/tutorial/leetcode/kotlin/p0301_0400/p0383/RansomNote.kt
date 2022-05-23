package org.svaor.tutorial.leetcode.kotlin.p0301_0400.p0383

class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var ransomNoteLength = ransomNote.length
        val ransomNoteAgg = IntArray(26)
        for (i in 0 until ransomNoteLength) {
            ransomNoteAgg[ransomNote[i].code - 97]++
        }
        var i = 0
        while (i < magazine.length && ransomNoteLength != 0) {
            val index = magazine[i].code - 97
            if (ransomNoteAgg[index] > 0) {
                ransomNoteLength--
                ransomNoteAgg[index]--
            }
            i++
        }
        return ransomNoteLength == 0
    }
}
