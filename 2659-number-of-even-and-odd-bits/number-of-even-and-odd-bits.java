class Solution {
    public int[] evenOddBit(int n) {
        int arr[] = new int[2];
        String str = Integer.toBinaryString(n);
        String s = "";
        for(int i=str.length()-1;i>=0;i--){
            s += str.charAt(i);
        }
        //System.out.print(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(i%2==0){
                    arr[0]++;
                }
                else{
                    arr[1]++;
                }
            }
        }
        return arr;
    }
}