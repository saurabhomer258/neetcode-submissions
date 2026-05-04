class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val set = mutableSetOf<Char>()   // To store unique characters
        var left = 0                    // Left pointer
        var maxLength = 0               // Store max length found

        for (right in s.indices) {

            // If duplicate found, shrink window from left
            while (s[right] in set) {
                set.remove(s[left])
                left++
            }

            // Add current character
            set.add(s[right])

            // Update max length
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}