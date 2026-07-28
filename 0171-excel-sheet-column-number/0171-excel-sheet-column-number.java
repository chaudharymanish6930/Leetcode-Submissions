class Solution {
    public int titleToNumber(String columnTitle) {
        int x=0;
        for(int i=0; i<columnTitle.length(); i++){
            int val =  columnTitle.charAt(i)-'A'+1;
            x = x*26+val; 
        }
        return x;
    }
}