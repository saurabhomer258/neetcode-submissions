class Solution {
    fun search(nums: IntArray, target: Int): Int {
            var right = nums.size - 1
            var left = 0
            while(left <= right) {
                var mid = (left + right)/2
                if (target == nums[mid]) return mid
                if(target < nums[mid]) {
                   if(nums[mid] > nums[right] && nums[right] >= target) {
                       left = mid + 1
                   }
                   else {
                      right = mid -1
                   }
                }
                else if(target >= nums[mid]) {
                         if(nums[mid] < nums[left] && nums[left] <= target) {
                                right = mid - 1
                         }
                         else {
                            left = mid + 1
                         }
                } 
            }
            return -1
    }
}
