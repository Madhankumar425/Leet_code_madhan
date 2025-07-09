class Solution {
   
    public int gcd(int a,int b){
        while(b != 0)
        {
            int temp = b;
            b = a %b;
            a = temp;
        }
        return a;
    }

    public int findGCD(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[len-1];
        return gcd(a,b);
    }
}