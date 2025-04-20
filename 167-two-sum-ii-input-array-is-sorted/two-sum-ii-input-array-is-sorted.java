class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
       int l = 0;
        int e = len-1;
        while(l<e){
            int sum = numbers[l] + numbers[e];
            if(sum==target){
                return new int[]{l+1,e+1};
            }
            else if(sum<target){
                l++;
            }
            else{
                e--;
            }
        }
     return new int[]{-1,-1};
    }
}