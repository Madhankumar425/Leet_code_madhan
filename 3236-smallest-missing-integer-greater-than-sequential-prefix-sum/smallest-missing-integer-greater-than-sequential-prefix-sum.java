class Solution {
    public int missingInteger(int[] nums) {
        int len = nums.length;
        int sum = nums[0];
        for(int i=1;i<len;i++){
            if(nums[i-1]+1==nums[i]){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        // return sum;
        for(int j = 0;j<len;j++){
            if(nums[j]==sum){
                sum++;
                j = -1;
            }
        }
        return sum;
    }
}