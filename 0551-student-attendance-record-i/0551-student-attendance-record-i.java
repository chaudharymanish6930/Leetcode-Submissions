class Solution {
    public boolean checkRecord(String s) {
        int p=0;
        int l=0;
        int max=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                p++;
                l=0;
            }
            else if(s.charAt(i)=='L'){
                l++;
                max=Math.max(max,l);
            }
            else{
                l=0;
            }
        }
        if(p<2 && max<3){
            return true;
        }
        return false;
    }
}