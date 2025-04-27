class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        for(int i : nums){
          sum += i;
       }
       int temp = 0;
       for(int j=len-1;j>=0;j--){
        temp += nums[j];
        list.add(nums[j]);
        if(temp>sum-temp){
            break;
        }
       }
       return list;
    }
}