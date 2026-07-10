class Solution {
    public int secondHighest(String s) {
        int x=-1;
        int y=-1;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit= ch -'0';

                if(digit>x){
                    y=x;
                    x=digit;
                }
                else if(digit<x && digit>y){
                    y=digit;
                }
            }
        }
        return y;
    }
}