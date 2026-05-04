class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val count = IntArray(26)
        var left = 0
        var maxFreq = 0
        var maxLength = 0

        for (right in s.indices) {
            val index = s[right] - 'A'
            count[index]++
            
            maxFreq = maxOf(maxFreq, count[index])

            while ((right - left + 1) - maxFreq > k) {
                count[s[left] - 'A']--
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)
        }
        return maxLength
    }
}