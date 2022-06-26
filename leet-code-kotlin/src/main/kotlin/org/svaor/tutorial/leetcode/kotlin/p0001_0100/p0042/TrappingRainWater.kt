package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0042

import kotlin.math.max
import kotlin.math.min

class TrappingRainWater {
    fun trap(heights: IntArray): Int {
        if (heights.isEmpty()) {
            return 0
        }

        val size = heights.size
        var previousHeight = heights[0]
        var previousIndex = 0
        var trappedWater = 0
        var waterAfterLastTop = 0

        (1 until size).forEach {
            if (heights[it] >= previousHeight) {
                previousHeight = heights[it]
                previousIndex = it
                waterAfterLastTop = 0
            } else {
                val diff = previousHeight - heights[it]
                trappedWater += diff
                waterAfterLastTop += diff
            }
        }

        // last height was not the highest
        if (previousIndex < size - 1) {
            trappedWater -= waterAfterLastTop
            previousHeight = heights[size - 1]
            // recalculate water from the end to the last top
            (previousIndex until size).reversed().forEach {
                if (heights[it] >= previousHeight) {
                    previousHeight = heights[it]
                } else {
                    trappedWater += previousHeight - heights[it]
                }
            }
        }

        return trappedWater
    }

    @Suppress("unused")
    fun trapFaster(heights: IntArray): Int {
        if (heights.isEmpty()) {
            return 0
        }

        val size = heights.size
        val left = IntArray(size)
        val right = IntArray(size)

        left[0] = heights[0]
        (1 until size).forEach {
            left[it] = max(heights[it], left[it - 1])
        }
        right[size - 1] = heights[size - 1]
        (0 until (size - 1)).reversed().forEach {
            right[it] = max(heights[it], right[it + 1])
        }

        return heights.withIndex().sumOf { (i, value) ->
            val trappedWater = min(left[i], right[i]) - value
            if (trappedWater > 0) trappedWater else 0
        }
    }

    @Suppress("unused")
    fun trapHeadOn(heights: IntArray): Int {
        if (heights.isEmpty()) {
            return 0
        }

        var trappedWater = 0

        heights.withIndex().forEach outer@{ (index, curHeight) ->
            // first and last bar can not trap water
            if (index == 0 || index == heights.size - 1) {
                return@outer
            }

            var maxLeft = 0
            (0 until index).forEach inner@{
                val curLeftHeight = heights[it]
                if (curHeight > curLeftHeight || curLeftHeight < maxLeft) {
                    return@inner
                }

                maxLeft = curLeftHeight
            }

            var maxRight = 0
            ((index + 1) until heights.size).forEach inner@{
                val curRightHeight = heights[it]
                if (curHeight > curRightHeight || curRightHeight < maxRight) {
                    return@inner
                }

                maxRight = curRightHeight
            }

            val curTrappedWater = min(maxRight, maxLeft) - curHeight
            if (curTrappedWater > 0) {
                trappedWater += curTrappedWater
            }
        }

        return trappedWater
    }
}
