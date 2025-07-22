class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len = arr.length;
        int count = 0;
        for(int i=0;i<len;i++){
           for(int j=i+1;j<len;j++){
            for(int k=j+1;k<len;k++){
                int ans = Math.abs(arr[i]-arr[j]);
                int bns = Math.abs(arr[j]-arr[k]);
                int cns = Math.abs(arr[i]-arr[k]);
                if(ans <= a && bns <= b && cns <= c){
                    count++;
                }
            }
           }
        }
        return count;
    }
}