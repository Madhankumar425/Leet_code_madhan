class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
       for(int i=0;i<t.length();i++){
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
       }
       // System.out.print(map);
       char ch = ' ';
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        if(entry.getValue()<0){
            ch = entry.getKey();
        }
       }
        return ch ;
    }
        }