class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean neg = false;
        if(num<0){
            neg = true;
        } 
        num = Math.abs(num);
        String str = "";
        while(num>0){
            int rem = num%7;
            str += rem;
             num /= 7;
        }
        if(neg){
            str += "-";
        }
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}