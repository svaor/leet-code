package org.svaor.tutorial.leetcode.kotlin.p0201_0300.p0234

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNodeUtils.Companion.from
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

class IsPalindromeTest {
    private val log by LoggerDelegate()

    @Test
    fun test() {
        val isPalindrome = IsPalindrome()

        val sample1 = from(1, 2, 1)
        log.debug("Sample 1 (1, 2, 1): {}", sample1)
        assertThat(isPalindrome.isPalindrome(sample1), equalTo(true))
        val sample2 = from(1, 2, 2, 1)
        log.debug("Sample 2 (1, 2, 2, 1): {}", sample2)
        assertThat(isPalindrome.isPalindrome(sample2), equalTo(true))
        val sample3 = from(1, 2, 3, 2, 1)
        log.debug("Sample 2 (1, 2, 3, 2, 1): {}", sample3)
        assertThat(isPalindrome.isPalindrome(sample3), equalTo(true))
        val sample4 = from(1, 2, 3, 3, 2, 1)
        log.debug("Sample 2 (1, 2, 3, 3, 2, 1): {}", sample4)
        assertThat(isPalindrome.isPalindrome(sample4), equalTo(true))
        val sample5 = from(1, 2, 3, 3, 1)
        log.debug("Sample 2 (1, 2, 3, 3, 1): {}", sample5)
        assertThat(isPalindrome.isPalindrome(sample5), equalTo(false))
    }
}