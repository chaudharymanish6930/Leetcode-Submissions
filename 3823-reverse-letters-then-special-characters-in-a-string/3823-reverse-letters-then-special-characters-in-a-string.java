class Solution {
    public String reverseByType(String s) {
        String str="";
        String chr="";

        Set<Character> ch= Set.of('!','@','#','$','%','^','&','*','(',')');

        for(int i=0; i<s.length(); i++){
            if(ch.contains(s.charAt(i))){
                chr += s.charAt(i);
            }
            else{
                str += s.charAt(i);
            }
        }

        int i=str.length()-1;
        int j=chr.length()-1;
        String ans="";
        for(int k=0; k<s.length(); k++){
            if(ch.contains(s.charAt(k))){
                ans += chr.charAt(j);
                j--;
            }
            else{
                ans += str.charAt(i);
                i--;
            }
        }
        return ans;
    }
}