class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3){
            return s;
        }
       char[] ch = s.toCharArray();
       StringBuilder sb = new StringBuilder();
       sb.append(ch[0]);
       sb.append(ch[1]);
       for(int i=2;i<ch.length;i++){
        char c = ch[i];
        if(ch[i-1]==c && ch[i-2]==c){
            continue;
        }
        sb.append(ch[i]);
       }
       return sb.toString();
    }
}