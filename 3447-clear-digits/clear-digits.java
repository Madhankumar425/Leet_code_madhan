class Solution {
    public String clearDigits(String s) {
        char[] ch = s.toCharArray();
       Stack<Character> stack = new Stack<>();
       for(int i=0;i<ch.length;i++){
        if(Character.isLetter(ch[i])){
            stack.push(ch[i]);
        }
        else if(Character.isDigit(ch[i]) && !stack.isEmpty()){
           stack.pop();
        }
       }
       String res = "";
       while(!stack.isEmpty()){
        res = stack.pop() + res;
       }
       return res;
      
    }
}