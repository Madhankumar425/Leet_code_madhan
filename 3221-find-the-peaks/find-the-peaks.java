class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int len = mountain.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<len-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                list.add(i);
            }
        }
        return list;
    }
}