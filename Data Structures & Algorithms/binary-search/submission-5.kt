class Solution {
    fun search(nums: IntArray, target: Int): Int {
            var right = nums.size - 1
            var left = 0
            while(left <= right) {
                var mid = (left + right)/2
                if(nums[mid] == target) {
                    return mid
                }
                else if(nums[mid] < target){
                        left = mid + 1
                }
                else {
                    right = mid -1
                }

            }
            return -1
    }
}
