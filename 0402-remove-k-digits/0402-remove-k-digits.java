class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()){
            return "0";
        }

        Deque<Character> stack=new ArrayDeque<>();
        for(char ch:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peekLast()>ch){
                stack.removeLast();
                k--;
            }
            stack.addLast(ch);
        }
        while(k>0 && !stack.isEmpty()){
            stack.removeLast();
            k--;
        }
        StringBuilder sb =new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.removeFirst());
        }

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        String res=sb.toString();
        return res.isEmpty() ? "0" :res;
    }
}