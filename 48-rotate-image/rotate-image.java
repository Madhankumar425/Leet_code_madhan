class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int arr[][] = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
             arr[j][len - 1 - i] = matrix[i][j];
            }
        }
        //
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=0;j--){
                   matrix[i][j] = arr[i][j];
                   System.out.print(matrix[i][j]+" ");
            }
        }
    }
}