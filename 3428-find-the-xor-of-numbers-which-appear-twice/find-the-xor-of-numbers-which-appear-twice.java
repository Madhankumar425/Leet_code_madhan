class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int len = nums.length;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        //
        for(int i : set){
            int count = 0;
            for(int j=0;j<len;j++){
                if(i==nums[j]) count++;
            }
            if(count==2) ans = ans^i;
        }
        return ans;
    }
}