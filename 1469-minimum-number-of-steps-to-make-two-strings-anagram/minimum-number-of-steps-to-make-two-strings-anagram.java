class Solution {
    public int minSteps(String s, String t) {
        int sum = 0;
        int freq[] = new int[26];
        char[] ch = s.toCharArray();
        char[] cha = t.toCharArray();
        for(int i=0;i<ch.length;i++){
            freq[ch[i]-'a']++;
            freq[cha[i]-'a']--;
        }
        //
        for(int i : freq){
            if(i>0) sum += i;
        }
        return sum;
    }
}