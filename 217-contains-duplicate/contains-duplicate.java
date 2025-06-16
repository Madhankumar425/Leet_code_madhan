class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    int len = nums.length;
    //    Arrays.sort(nums);
    //    for(int i=0;i<len-1;i++){
    //     if(nums[i]==nums[i+1]){
    //         return true;
    //     }
    //    }
    //    return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(set.size()!=nums.length){
            return true;
        }
        return false;
    }
}