class Solution {
    public void sortColors(int[] nums) {
         Arrays.sort(nums);
        for(int k : nums){
            System.out.print(k+",");
        }
    }
}