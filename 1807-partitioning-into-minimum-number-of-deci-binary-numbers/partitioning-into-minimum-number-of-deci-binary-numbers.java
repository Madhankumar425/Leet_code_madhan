class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
          int num = n.charAt(i)- '0';
            int rem = num%10;
            if(rem>max){
                max = rem;
            }
            num /=10;
        }
        return max;
    }
}