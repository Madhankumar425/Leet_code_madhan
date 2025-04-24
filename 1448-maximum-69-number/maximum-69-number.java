class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();
        int ans = 0;
        int max = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='6'){
                ch[i] = '9';
                return Integer.parseInt(String.valueOf(ch));
            }
        }
        return num;
    }
}