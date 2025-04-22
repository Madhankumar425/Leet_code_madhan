class Solution {
    public int digitsum(int num){
        int ans = num;
        int sum = 0;
        while(ans>0){
            int rem = ans%10;
            sum += rem;
            ans /= 10;
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        int freq[] = new int[37];
        int count = 0;
        for(int i=1;i<=n;i++){
           int res = digitsum(i);
           freq[res]++;
        }
        // condition
        int max = Integer.MIN_VALUE;
        for(int j : freq){
             if(j>max){
                max = j;
             }
        }
        //
        for(int k : freq){
            if(k==max){
                count++;
            }
        }
        return count;
    }
}