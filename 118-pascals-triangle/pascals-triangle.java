class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        list.add(new ArrayList<>());

        list.get(0).add(1);
        for(int i=2;i<=numRows;i++){
           List<Integer> t = new ArrayList<>();
           int ind = 1;
           t.add(1);
           while(t.size()<i-1){
            t.add(list.get(i-2).get(ind) + list.get(i-2).get(ind-1));
            ind++;
           }
           t.add(1);
           list.add(t);
        }

        return list;
    }
}