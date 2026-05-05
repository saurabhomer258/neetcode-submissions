class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
            var right = piles.max()
            var left = 1
            var result = right
            while (left <= right) { 
                var mid = left + (right - left + 1)/2
                var hours = 0
                for (pile in piles) {
                    hours += ceil(pile.toDouble() /mid).toInt()
                }
                if (hours <= h) {
                        result = mid
                        right = mid -1
                }
                else  {
                    left = mid + 1
                }
            }
            return result
    }
}
