class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = 0;
        int count = 0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                count++;
                if(max<count)
               {
                max = count;
              }
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}