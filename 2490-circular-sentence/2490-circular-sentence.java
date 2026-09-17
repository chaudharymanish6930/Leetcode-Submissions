class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words=sentence.split(" ");
        for(int i=0; i<words.length-1; i++){
            char last=words[i].charAt(words[i].length()-1);
            char first=words[i+1].charAt(0);
            if(last!=first){
                return false;
            }
        }
        char last=words[words.length-1].charAt(words[words.length-1].length()-1);
        char first=words[0].charAt(0);
        return first==last;
    }
}