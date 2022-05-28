package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0004

import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE
import kotlin.math.max
import kotlin.math.min

class MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        if (nums1.size > nums2.size) {
            return findMedianSortedArrays(nums2, nums1)
        }

        //nums1 is always shorter than nums2 (or equal)
        val length1 = nums1.size
        val length2 = nums2.size

        if (length1 == 0 && length2 == 0) {
            return 0.0
        }

        var portion1 = length1 / 2 // w/o + 1, i.e. smaller part of array
        var portion2 = (length1 + length2 + 1) / 2 - portion1

        var delta = (length1 - portion1 + 1) / 2
        while (delta != 0) {
            if (nums1.getOrElse(portion1) { MAX_VALUE } < nums2.getOrElse(portion2 - 1) { MIN_VALUE }) {
                // Next element after first portion is smaller than last element of second portion
                // So first portion should be increased and second portion should be decreased
                portion1 += delta
                portion2 -= delta
                delta = (delta + 1) / 2
            } else if (nums1.getOrElse(portion1 - 1) { MIN_VALUE } > nums2.getOrElse(portion2) { MAX_VALUE }) {
                portion1 -= delta
                portion2 += delta
                delta = (delta + 1) / 2
            } else {
                break
            }
        }

        val result = if ((length1 + length2) % 2 == 0) {
            if (portion1 == 0) {
                (nums2[portion2 - 1] + min(nums2.getOrElse(portion2) { MAX_VALUE }, nums1.getOrElse(0) { MAX_VALUE })) / 2.0
            } else if (portion2 == 0) {
                (nums1[portion1 - 1] + min(nums1.getOrElse(portion1) { MAX_VALUE }, nums2.getOrElse(0) { MAX_VALUE })) / 2.0
            } else {
                (max(nums1.getOrElse(portion1 - 1) { MIN_VALUE }, nums2.getOrElse(portion2 - 1) { MIN_VALUE }) +
                        min(nums1.getOrElse(portion1) { MAX_VALUE }, nums2.getOrElse(portion2) { MAX_VALUE })) / 2.0
            }
        } else {
            max(nums1.getOrElse(portion1 - 1) { MIN_VALUE }, nums2.getOrElse(portion2 - 1) { MIN_VALUE }).toDouble()
        }

        return result
    }
}
