class Solution {
    public int distinctAverages(int[] nums) {
        int len = nums.length;
        Set<Double> set = new HashSet<>();
        //
        Arrays.sort(nums);
        int st = 0;
        int end = len-1;
        while(st<end){
            double avg= (nums[st]+nums[end])/2.0;
            set.add(avg);
            st++;
            end--;
        }
        return set.size();
    }
}