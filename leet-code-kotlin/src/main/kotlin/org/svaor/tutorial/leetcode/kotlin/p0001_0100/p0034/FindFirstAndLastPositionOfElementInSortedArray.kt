package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0034

class FindFirstAndLastPositionOfElementInSortedArray {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) {
            return intArrayOf(-1, -1)
        }

        val firstOccurrence = search(nums) {
            index ->
            if (nums[index] == target && (index == 0 || nums[index - 1] < target)) {
                0
            } else if (nums[index] < target) {
                1
            } else {
                -1
            }
        }
        if (firstOccurrence == -1) {
            return intArrayOf(-1, -1)
        }

        val lastOccurrence = search(nums) {
                index ->
            if (nums[index] == target && (index == nums.size - 1 || nums[index + 1] > target)) {
                0
            } else if (nums[index] <= target) {
                1
            } else {
                -1
            }
        }

        return intArrayOf(firstOccurrence, lastOccurrence)
    }

    private fun search(nums: IntArray, condition: (Int) -> Int): Int {
        var leftIndex = 0
        var rightIndex = nums.size - 1

        while (leftIndex <= rightIndex) {
            val midIndex = leftIndex + (rightIndex - leftIndex) / 2

            val conditionResult = condition(midIndex)
            if (conditionResult == 0) {
                return midIndex
            } else if (conditionResult < 0) {
                //left part
                rightIndex = midIndex - 1
            } else {
                //right part
                leftIndex = midIndex + 1
            }
        }

        return -1
    }
}
