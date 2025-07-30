class Solution {
    public int[] separateDigits(int[] nums) {
        int len = nums.length;
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            String ch = String.valueOf(nums[i]);
            for(int j=0;j<ch.length();j++){
                list.add(ch.charAt(j)-'0');
            }
        }
        int arr[] = new int[list.size()];
        for(int k=0;k<list.size();k++){
            arr[k] = list.get(k);
        }
        return arr;
    }
}