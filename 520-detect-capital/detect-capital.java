class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int count = 0;
        int lower = 0;
        for(int i=0;i<len;i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
            if(Character.isUpperCase(word.charAt(0))){
                if(Character.isLowerCase(word.charAt(i))){
                          lower++;
                }
            }

        }
            //
            if(count==len || count==0 || lower==len-1){
                return true;
            }
            return false;
    }
}