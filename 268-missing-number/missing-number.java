class Solution {
    public int missingNumber(int[] nums) {
        int arr[] = new int[10001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        //
        int ans = 0;
        for(int j=0;j<nums.length+1;j++){
            if(arr[j]==0){
                ans = j;
            }
        }
        return ans;
    }
}