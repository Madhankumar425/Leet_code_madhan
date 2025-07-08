class Solution {
    public int bitwiseComplement(int n) {
        String bin = "";
        if(n==0){
            return 1;
        }
        while(n!=0){
            int rem = n%2;
            bin = rem + bin;
            n /= 2;
        }
        //
        char[] ch = bin.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                ch[i] = '0';
            }
            else{
                ch[i] = '1';
            }
        }
        //
        int sum = 0;
        int k = 1;
        for(int j=ch.length-1;j>=0;j--){
           if(ch[j]=='1'){
            sum += k;
           }
           k *= 2;
        }
        return sum;
    }
}