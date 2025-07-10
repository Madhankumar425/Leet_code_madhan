class Solution {
    public String finalString(String s) {
       char[] ch = s.toCharArray();
       StringBuilder str = new StringBuilder();
       for(int i=0;i<ch.length;i++){
         if(ch[i]=='i')
         {
            str.reverse();
         }
         else{
            str.append(ch[i]);
         }
       }
       return str.toString();
    }
}