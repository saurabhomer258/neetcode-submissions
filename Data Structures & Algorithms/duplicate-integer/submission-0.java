class Solution {
    public boolean hasDuplicate(int[] nums) {
            HashMap <Integer,Integer> numMap = new HashMap();
            for (int i =0 ; i < nums.length ; i++) {
                if(numMap.get(nums[i]) != null){
                    return true;
                }
                numMap.put(nums[i],1);
            }
            return false;
    }
}