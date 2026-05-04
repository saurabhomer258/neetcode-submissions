class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
            var n = nums.size
            var res = IntArray(2*n)
            for(i in 0 until n) {
                res[i] = nums[i]
                res[n + i] = nums[i]
            }
        return res
    }
}
