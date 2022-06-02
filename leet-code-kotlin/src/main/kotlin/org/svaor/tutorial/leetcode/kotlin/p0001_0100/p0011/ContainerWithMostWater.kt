package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0011

import kotlin.math.max

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        if (height.isEmpty()) {
            return 0
        }

        var area = -1

        var left = 0
        var right = height.size - 1

        while (left < right) {
            if (height[left] < height[right]) {
                area = max(area, height[left] * (right - left))
                left++
            } else {
                area = max(area, height[right] * (right - left))
                right--
            }
        }

        return area
    }
}
