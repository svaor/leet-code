package org.svaor.tutorial.leetcode.kotlin.p1601_1700.p1672

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

internal class RichestCustomerWealthTest {
    @Test
    internal fun maximumWealth() {
        val richestCustomerWealth = RichestCustomerWealth()

        val accounts1 = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 1),
        )
        assertThat(richestCustomerWealth.maximumWealth(accounts1), equalTo(6))

        val accounts2 = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(7, 3),
            intArrayOf(3, 5),
        )
        assertThat(richestCustomerWealth.maximumWealth(accounts2), equalTo(10))

        val accounts3 = arrayOf(
            intArrayOf(2, 8, 7),
            intArrayOf(7, 1, 3),
            intArrayOf(1, 9, 5),
        )
        assertThat(richestCustomerWealth.maximumWealth(accounts3), equalTo(17))
    }
}
