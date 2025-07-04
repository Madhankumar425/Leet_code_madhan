class Solution {
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        // Set<Integer> row = new HashSet<>();
        // Set<Integer> col = new HashSet<>();
        for(int i=0;i<len;i++)
        {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int j=0;j<len;j++){
            row.add(matrix[i][j]);
            col.add(matrix[j][i]);
        }
        //
        if(row.size() != len || col.size() != len){
            return false;
        }
        }
        return true;
    }
}