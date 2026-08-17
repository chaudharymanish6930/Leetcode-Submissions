class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='-'){
                str +=s.charAt(i);
            }
        }
        str = str.toUpperCase();
        int len=str.length();
        int first=len%k;
        String ans="";
        for(int i=0; i<first; i++){
            ans += str.charAt(i);
        }
        if(ans.length()==0){
            ans +="";
        }
        else if(first > 0 && first < len){
            ans += '-';
        }
        
        int count=0;
        for(int i=first; i<str.length(); i++){
            if(count<k){
                ans += str.charAt(i);
                count++;
            }
            else{
                ans  += '-';
                // ans += str.charAt(i);
                count=0;
                i--;
            }
        }
        return ans;
    }
}