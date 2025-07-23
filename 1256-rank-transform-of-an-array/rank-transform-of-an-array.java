class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int num[] = arr.clone();
        Arrays.sort(num);
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
       for(int i=0;i<len;i++){
         if(!map.containsKey(num[i])){
            map.put(num[i],rank++);
          }
       }
    for(int i = 0;i<len;i++){
        num[i] = map.get(arr[i]);
    }
     return num;
    }
}