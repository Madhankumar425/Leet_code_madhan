class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int max =Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<len;i++){
            if(nums[i]>max){
                max = nums[i];
                ans = i;
            }
        }
        return ans;
    }
}