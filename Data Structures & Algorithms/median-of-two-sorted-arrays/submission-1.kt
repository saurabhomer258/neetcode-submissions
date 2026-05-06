class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var a = nums1
        var b = nums2

        // Always do binary search on smaller array
        if (a.size > b.size) {
            a = nums2
            b = nums1
        }

        val total = a.size + b.size
        val half = (total + 1) / 2

        var left = 0
        var right = a.size

        while (left <= right) {
            val i = (left + right) / 2
            val j = half - i

            val leftA = if (i == 0) Int.MIN_VALUE else a[i - 1]
            val rightA = if (i == a.size) Int.MAX_VALUE else a[i]

            val leftB = if (j == 0) Int.MIN_VALUE else b[j - 1]
            val rightB = if (j == b.size) Int.MAX_VALUE else b[j]

            // Correct partition
            if (leftA <= rightB && leftB <= rightA) {
                return if (total % 2 == 0) {
                    (maxOf(leftA, leftB) + minOf(rightA, rightB)) / 2.0
                } else {
                    maxOf(leftA, leftB).toDouble()
                }
            }

            // Move binary search
            if (leftA > rightB) {
                right = i - 1
            } else {
                left = i + 1
            }
        }

        return 0.0
    }
}
