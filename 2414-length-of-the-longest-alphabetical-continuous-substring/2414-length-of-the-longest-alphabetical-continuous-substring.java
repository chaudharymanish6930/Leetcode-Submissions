class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1;
        for(int i=0; i<s.length(); i++){
            int len=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j)==s.charAt(j-1)+1){
                    len++;
                }
                else{
                    break;
                }
            }
            max=Math.max(max,len);
        }
        return max;
    }
}