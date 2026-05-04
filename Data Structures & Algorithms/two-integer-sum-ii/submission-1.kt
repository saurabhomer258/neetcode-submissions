class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
            var left = 0
            var right = numbers.size - 1
            while(left < right) {
                var result = numbers[left] + numbers[right]
                when {
                    result < target ->  left ++ 
                    result > target -> right --
                    result == target -> return intArrayOf(left +1 , right +1)
                }
            }
            return intArrayOf()
    }
}
