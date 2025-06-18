class Solution {
    public int[] twoSum(int[] nums, int target) {
       int len = nums.length;
       Map<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];
       for(int i=0;i<len;i++){
            if(!map.isEmpty() && map.containsKey(target-nums[i])){
                arr[1] = i;
                arr[0] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
       }
       //
      return arr;
    }
}
 