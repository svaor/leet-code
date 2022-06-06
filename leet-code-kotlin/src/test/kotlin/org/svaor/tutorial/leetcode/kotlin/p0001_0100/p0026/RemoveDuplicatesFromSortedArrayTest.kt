package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0026

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class RemoveDuplicatesFromSortedArrayTest {
    private val log by LoggerDelegate()

    private val t = RemoveDuplicatesFromSortedArray()

    @Test
    fun removeDuplicates() {
        assertArray(intArrayOf(1, 1, 2), intArrayOf(1, 2))
        assertArray(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4), intArrayOf(0, 1, 2, 3, 4))
    }

    private fun assertArray(nums: IntArray, expected: IntArray) {
        log.debug("Original nums: {}", nums)

        val uniqueElementCount = expected.size
        val numsWODuplicates = t.removeDuplicates(nums)
        log.debug("Nums count w/o duplicates: {}", numsWODuplicates)
        log.debug("Nums w/o duplicates: {}", nums)

        assertThat(numsWODuplicates, equalTo(uniqueElementCount))
        assertThat(nums.sliceArray(0 until uniqueElementCount), equalTo(expected))
    }
}
