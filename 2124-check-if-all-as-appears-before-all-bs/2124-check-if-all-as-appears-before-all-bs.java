class Solution {
    public boolean checkString(String s) {
        for(int i=1; i<s.length(); i++){
            char ch=s.charAt(i-1);
            if(ch=='b'){
                if(s.charAt(i)=='a'){
                    return false;
                }
            }
        }
        return true;
    }
}