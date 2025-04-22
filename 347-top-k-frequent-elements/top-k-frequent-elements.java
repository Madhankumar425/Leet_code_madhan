class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //
        int arr[] = new int[k];
        for(int j = 0;j<k;j++){
            int max = 0;
            int key = 0;
            for(int i : map.keySet()){
                if(map.get(i)>max){
                    max = map.get(i);
                    key = i;
                }
            }
            arr[j]  = key;
            map.remove(key);
        }
        return arr;
    }
}