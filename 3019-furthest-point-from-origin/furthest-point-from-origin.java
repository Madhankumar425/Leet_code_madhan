class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char[] ch = moves.toCharArray();
        int x = 0;
        int r = 0;
        int l = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='_') x++;
            if(ch[i]=='R') r++;
            if(ch[i]=='L') l++;
        }
        
        return Math.abs(r-l) + x;
    }
}