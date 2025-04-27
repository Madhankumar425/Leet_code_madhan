class Solution {
    public int numberOfSpecialChars(String word) {
        int freq[] = new int[26];
        Set<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        //
        for(char j : set){
           int ans = Character.toLowerCase(j)-'a';
            freq[ans]++;
        }

        //
        int count = 0;
        for(int i =0;i<26;i++){
            if(freq[i]==2){
                count++;
            }
        }
             return count;
    }
}