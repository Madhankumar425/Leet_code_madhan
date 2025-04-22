class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            int count = 0;
            for(int j=0;j<len;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            list.add(count);
        }
        // condition
        int ind = 0;
        int arr[] = new int[list.size()];
        for(int j : list){
           arr[ind] = j;
           ind++;
        }
        return arr;
    }
}