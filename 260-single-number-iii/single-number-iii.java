class Solution {
    public int[] singleNumber(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            set.add(i);
        }
        //
        for(int i : set){
            int count = 0;
            for(int j=0;j<len;j++){
                if(i==nums[j]) count++;
            }
            if(count==1){
                list.add(i);
            }
        }
        int arr[] = new int[2];
        int k = 0;
        for(int i : list){
            arr[k] = i;
            k++;
        }
        return arr;
    }
}