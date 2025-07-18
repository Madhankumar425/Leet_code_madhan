class Solution {
    public String convertDateToBinary(String date) {
        String arr[] = date.split("-");
        StringBuilder a = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            int ans = Integer.valueOf(arr[i]);
            String res = Integer.toBinaryString(ans);
            a.append(res);
            if(i!=arr.length-1){
            a.append("-");
            }
        }
        return a.toString();
    }
}