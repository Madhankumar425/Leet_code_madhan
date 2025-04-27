class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder str = new StringBuilder();
        String[] arr = title.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<=2){
                str.append(arr[i].toLowerCase());
            }
            else{
            String s = arr[i]; 
            str.append(s.substring(0, 1).toUpperCase());
            str.append(s.substring(1).toLowerCase());
            }
            if(i!= arr.length-1) str.append(" ");
        }
        return str.toString();
    }
}