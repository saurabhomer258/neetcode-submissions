class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxWater = 0
        
        while (left < right) {
            val h = minOf(height[left], height[right])
            val width = right - left
            val area = h * width
            
            maxWater = maxOf(maxWater, area)
            
            // Move the smaller height
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        
        return maxWater
    }
}