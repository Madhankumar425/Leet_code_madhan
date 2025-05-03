class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        //
        int res = 0;
        for(int i : set){
            int count = 0;
            for(int j=0;j<len;j++){
                if(i==nums[j]) count++;
            }
            if(count==1){
                res = i;
            }
        }
        //
        return res;
    }
}