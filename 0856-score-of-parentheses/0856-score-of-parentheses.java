class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack= new Stack<>();
        stack.push(0);

        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(0);
            }
            else{
                int x=stack.pop();
                if(x==0){
                    x=1;
                }
                else{
                    x=2*x;
                }
                int prev=stack.pop();
                stack.push(prev+x);
            }
        }
        return stack.pop();
    }
}