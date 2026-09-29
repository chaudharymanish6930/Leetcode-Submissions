class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] isJew = new boolean[128];
        for(char ch:jewels.toCharArray()){
            isJew[ch]=true;
        }
        int count =0;
        for(char c: stones.toCharArray()){
            if(isJew[c]){
                count++;
            }
        }
        return count;
    }
}