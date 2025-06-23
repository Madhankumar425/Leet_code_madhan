class Solution {
    public String removeDuplicates(String s) {
     char[] ch = s.toCharArray();
     Stack<Character> stack = new Stack<>();
     for(char i : ch){
        if(!stack.isEmpty() && stack.peek()==i){
            stack.pop();
        }
        else{
            stack.push(i);
        }
     }
     String ans = "";
     while(!stack.isEmpty()){
        ans = stack.pop() + ans ;
     }
     return ans;
    }
}