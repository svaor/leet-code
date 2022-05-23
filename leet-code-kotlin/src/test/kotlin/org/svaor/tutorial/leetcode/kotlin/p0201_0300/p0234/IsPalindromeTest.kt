package org.svaor.tutorial.leetcode.kotlin.p0201_0300.p0234

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.ListNode
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

class IsPalindromeTest {
    private val log by LoggerDelegate()

    @Test
    fun test() {
        val isPalindrome = IsPalindrome()

        val sample1 = ListNode(1, ListNode(2, ListNode(1)))
        log.debug("Sample 1 (1, 2, 1): {}", sample1)
        assertThat(isPalindrome.isPalindrome(sample1), `is`(true))
        val sample2 = ListNode(1, ListNode(2, ListNode(2, ListNode(1))))
        log.debug("Sample 2 (1, 2, 2, 1): {}", sample2)
        assertThat(isPalindrome.isPalindrome(sample2), `is`(true))
        val sample3 = ListNode(1, ListNode(2, ListNode(3, ListNode(2, ListNode(1)))))
        log.debug("Sample 2 (1, 2, 3, 2, 1): {}", sample3)
        assertThat(isPalindrome.isPalindrome(sample3), `is`(true))
        val sample4 = ListNode(1, ListNode(2, ListNode(3, ListNode(3, ListNode(2, ListNode(1))))))
        log.debug("Sample 2 (1, 2, 3, 3, 2, 1): {}", sample4)
        assertThat(isPalindrome.isPalindrome(sample4), `is`(true))
        val sample5 = ListNode(1, ListNode(2, ListNode(3, ListNode(3, ListNode(1)))))
        log.debug("Sample 2 (1, 2, 3, 3, 1): {}", sample5)
        assertThat(isPalindrome.isPalindrome(sample5), `is`(false))
    }
}