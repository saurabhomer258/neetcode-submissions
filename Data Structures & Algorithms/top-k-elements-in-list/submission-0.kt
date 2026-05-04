class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        // Step 1: Count frequency
        val freqMap = HashMap<Int, Int>()
        for (num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        // Step 2: Create buckets
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }

        for ((num, freq) in freqMap) {
            buckets[freq].add(num)
        }

        // Step 3: Collect top k frequent
        val result = mutableListOf<Int>()

        for (i in buckets.size - 1 downTo 0) {
            for (num in buckets[i]) {
                result.add(num)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }

        return result.toIntArray()
    }
}
