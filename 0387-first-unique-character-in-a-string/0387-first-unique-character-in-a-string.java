class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        for(int i=0; i<n; i++){
            char curr=s.charAt(i);
            boolean isRepeated=false;
            for(int j=0; j<n; j++){
                if(i!=j && curr ==s.charAt(j)){
                    isRepeated=true;
                    break;
                }
            }
            if(!isRepeated){
                return i;
            }
        }
        return -1;
    }
}