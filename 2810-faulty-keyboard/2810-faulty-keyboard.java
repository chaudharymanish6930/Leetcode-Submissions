class Solution {
    public String finalString(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        boolean reversed=false;
        for(char c:s.toCharArray()) {
            if(c == 'i'){
                reversed=!reversed;
            }
            else if (reversed){
                dq.addFirst(c);
            }
            else{
                dq.addLast(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (char c:dq){
            sb.append(c);
        }
        return reversed? sb.reverse().toString() : sb.toString();
    }
}