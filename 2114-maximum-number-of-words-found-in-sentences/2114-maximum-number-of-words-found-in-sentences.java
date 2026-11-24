class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++){
            String str=sentences[i];
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == ' '){
                    count++;
                }
            }
            max=Math.max(max, count+1);
            count=0;
        }
        return max;
    }
}