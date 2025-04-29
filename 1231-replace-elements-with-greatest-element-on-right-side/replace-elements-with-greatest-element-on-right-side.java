class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if(len==1){
            return new int[] {-1};
        }
        for(int i=0;i<len;i++){
            int max = 0;
            for(int j=i+1;j<len;j++){
                if(max<arr[j]){
                    max = arr[j];
                    arr[i] = max;
                }
            }
        }
        arr[len-1] = -1;
        return arr;
    }
}