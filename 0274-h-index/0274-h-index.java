class Solution {
    public int hIndex(int[] citations) {
        int count=0;
        for(int i=1; i<=citations.length; i++){
            int x=0;
            for(int j=0; j<citations.length; j++){
                if(citations[j]>=i){
                    x++;
                }
            }
            if(x>=i){
                count=i;
            }
        }
        return count;
    }
}