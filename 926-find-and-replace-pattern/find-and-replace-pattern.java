class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = pattern.length();
        List<String> list = new ArrayList<>();
        outerLoop:
        for(String w : words){
               Map<Character,Character> map = new HashMap<>();
               for(int i=0;i<n;i++){
                char j = pattern.charAt(i);
                char k = w.charAt(i);

                if(!map.containsKey(j) && !map.containsValue(k)){
                    map.put(j,k);
                }
            
                else if(map.containsKey(j) && map.get(j)!=k){
                    continue outerLoop;
                }

                else if(!map.containsKey(j) && map.containsValue(k)){
                    continue outerLoop;
                  }
               }
               list.add(w);
        }
        return list;
    }
}