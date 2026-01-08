class Solution {
    public int maxSubArray(int[] nums) {
        
        int len = nums.length;

        int res = nums[0];

        int max = nums[0];
        for(int i=1;i<len;i++){
            max = Math.max(max+nums[i],nums[i]);

            res = Math.max(res,max);
        }

        return res;
    }
}