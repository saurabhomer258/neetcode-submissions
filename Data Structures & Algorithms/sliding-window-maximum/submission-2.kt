class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {

        val deque = ArrayDeque<Int>()
        val result = mutableListOf<Int>()

        for (i in nums.indices) {

            // Remove smaller elements from back
            while (deque.isNotEmpty() && nums[deque.last()] < nums[i]) {
                deque.removeLast()
            }

            deque.addLast(i)

            // Remove indices outside window
            if (deque.first() < i - k + 1) {
                deque.removeFirst()
            }

            // Window formed
            if (i >= k - 1) {
                result.add(nums[deque.first()])
            }
        }

        return result.toIntArray()
    }
}