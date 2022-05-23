package org.svaor.tutorial.leetcode.kotlin.p1301_1400.p1337

class TheKWeakestRowsInAMatrix {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        return mat
            .mapIndexed { index, it -> index to it }
            .sortedWith(compareBy({ it.second.sum() }, { it.first }))
            .slice(0 until k)
            .map { it.first }
            .toIntArray()
    }
}
