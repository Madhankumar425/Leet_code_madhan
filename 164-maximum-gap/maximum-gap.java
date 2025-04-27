class Solution {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if(len<2){
            return 0;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++){
            int diff = Math.abs(nums[i]-nums[i+1]);
            if(diff>=max){
                max = diff;
            }
        }
        return max;
    }
}