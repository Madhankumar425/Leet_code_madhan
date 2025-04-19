class Solution {
    public int kthFactor(int n, int k) {
       //int arr[] = new int[n];
       int index = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               // arr[index] = i; 
                index++;
            }
            if(index==k){
                return i;
            }
            
        }
        // if(k>arr.length){
        //     return -1;
        // }
        // return arr[k-1];
        return -1;
    }
}