class Solution {
    public String finalString(String s) {
        String str="";
        for(char c:s.toCharArray()){
            String x="";
            if(c=='i'){
                for(int i=str.length()-1; i>=0; i--){
                    x +=str.charAt(i);
                }
                str=x;
            }
            else{
                str +=c;
            }
        }
        return str;
    }
}