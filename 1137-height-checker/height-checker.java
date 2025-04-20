class Solution {
    public int heightChecker(int[] nums) {
        int len = nums.length;
        int arr[] = nums.clone();
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<len;i++){
            if(arr[i]!=nums[i]){
                count++;
            }
        }
        return count;
    }
}