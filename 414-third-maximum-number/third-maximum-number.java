class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int index = 0;
        int arr[] = new int[set.size()];
        for(int j : set){
            arr[index] = j;
            index++;
        }
        Arrays.sort(arr);
        int n = arr.length;
        if(n<3){
            return arr[n-1];
        }
        return arr[n-3];
    }
}