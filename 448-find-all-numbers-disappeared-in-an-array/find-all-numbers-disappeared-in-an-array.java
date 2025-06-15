class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();
        // for(int i : nums){
        //     set.add(i);
        // }
        // int freq[] = new int[100001];
        // for(int i : set){
        //     freq[i]++;
        // }
        // //
        // for(int j=1;j<nums.length+1;j++){
        //     if(freq[j]==0) list.add(j);
        // }
        // return list;
       int freq[] = new int[100001];
       for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
       }
       for(int i=1;i<nums.length+1;i++){
        if(freq[i]==0){
            list.add(i);
        }
       }
        return list;
    }
}