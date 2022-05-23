package org.svaor.tutorial.leetcode.kotlin.p0301_0400.p0383

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class RansomNoteTest {
    @Test
    fun test() {
        val ransomNote = RansomNote()
        assertThat(ransomNote.canConstruct("a", "ab"), `is`(true))
        assertThat(ransomNote.canConstruct("a", "b"), `is`(false))
        assertThat(ransomNote.canConstruct("aa", "ab"), `is`(false))
        assertThat(ransomNote.canConstruct("aa", "aab"), `is`(true))
    }
}
