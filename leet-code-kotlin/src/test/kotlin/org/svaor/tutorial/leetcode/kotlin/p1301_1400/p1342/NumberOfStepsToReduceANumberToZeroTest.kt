package org.svaor.tutorial.leetcode.kotlin.p1301_1400.p1342

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class NumberOfStepsToReduceANumberToZeroTest {
    @Test
    fun numberOfSteps() {
        val numberOfSteps = NumberOfStepsToReduceANumberToZero()
        assertThat(numberOfSteps.numberOfSteps(14), `is`(6))
        assertThat(numberOfSteps.numberOfSteps(8), `is`(4))
        assertThat(numberOfSteps.numberOfSteps(123), `is`(12))
    }
}