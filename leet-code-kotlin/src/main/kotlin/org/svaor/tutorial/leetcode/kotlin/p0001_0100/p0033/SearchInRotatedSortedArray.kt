package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0033

class SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }

        var leftIndex = 0
        var rightIndex = nums.size - 1

        while (leftIndex <= rightIndex) {
            val portionIsRotated = nums[leftIndex] > nums[rightIndex]
            if (!portionIsRotated && target !in nums[leftIndex].. nums[rightIndex]) {
                break
            }

            val midIndex = (rightIndex - leftIndex) / 2 + leftIndex

            if (nums[midIndex] == target) {
                return midIndex
            }

            val rightPartIsRotated = nums[midIndex] > nums[rightIndex]
            if (rightPartIsRotated && (target <= nums[rightIndex] || target >= nums[midIndex]) || !rightPartIsRotated && target in nums[midIndex]..nums[rightIndex]) {
                leftIndex = midIndex + 1
            } else {
                val leftPartIsRotated = nums[leftIndex] > nums[midIndex]
                if (leftPartIsRotated && (target >= nums[leftIndex] || target <= nums[midIndex]) || !leftPartIsRotated && target in nums[leftIndex]..nums[midIndex]) {
                    rightIndex = midIndex - 1
                } else {
                    break
                }
            }
        }

        return -1
    }
}
