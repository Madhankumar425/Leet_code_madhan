class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int freq[] = new int[100001];
        for(int i : set){
            freq[i]++;
        }
        //
        for(int j=1;j<nums.length+1;j++){
            if(freq[j]==0) list.add(j);
        }
        return list;
    }
}