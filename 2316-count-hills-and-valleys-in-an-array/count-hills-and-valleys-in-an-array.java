class Solution {
    public int countHillValley(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int i=1;i<len-1;i++){
            if(nums[i]<nums[i+1] && nums[i]<nums[i-1]){
                count++;
            }
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                count++;
            }
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i-1];
            }
        }
        return count;
    }
}