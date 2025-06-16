class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int length = nums2.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<length;i++){
            for(int j=0;j<len;j++){
                if(nums2[i]==nums1[j]){
                    set.add(nums2[i]);
                }
            }
        }
        //
        int index = 0;
        int arr[] = new int[set.size()];
        for(int k : set){
            arr[index] = k;
            index++;
        }
        return arr;
    }
}