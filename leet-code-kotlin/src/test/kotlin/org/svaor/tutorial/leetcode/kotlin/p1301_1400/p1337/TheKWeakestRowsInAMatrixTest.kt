package org.svaor.tutorial.leetcode.kotlin.p1301_1400.p1337

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.svaor.tutorial.leetcode.kotlin.common.LoggerDelegate

internal class TheKWeakestRowsInAMatrixTest {
    private val log by LoggerDelegate()

    @Test
    fun kWeakestRows1() {
        val theKWeakestRowsInAMatrix = TheKWeakestRowsInAMatrix()
        val mat = arrayOf(
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1),
        )
        log.debug("Mat: {}", mat)

        val result = theKWeakestRowsInAMatrix.kWeakestRows(mat, 3)
        log.debug("Result: {}", result)

        assertThat(result, equalTo(arrayOf(2, 0, 3)))
    }

    @Test
    fun kWeakestRows2() {
        val theKWeakestRowsInAMatrix = TheKWeakestRowsInAMatrix()
        val mat = arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 0, 0, 0),
        )
        log.debug("Mat: {}", mat)

        val result = theKWeakestRowsInAMatrix.kWeakestRows(mat, 2)
        log.debug("Result: {}", result)

        assertThat(result, equalTo(arrayOf(0, 2)))
    }
}
