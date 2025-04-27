class Solution {
    public String greatestLetter(String s) {
        int freq[] = new int[26];
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        //
        for(int j : set){
            int ans = Character.toLowerCase(j) - 'a';
            freq[ans]++;
        }
        //
        Character str = ' ';
Character [] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
              if(freq[i]>=2){
                  if(i>max){
                    max = i;
                   str = Character.toUpperCase(arr[i]);
                  }
              }
        }
        return str.toString().trim();
    }
}