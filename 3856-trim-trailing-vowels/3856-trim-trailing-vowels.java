class Solution {
    public String trimTrailingVowels(String s) {
        String str="";
        Set<Character> ch= Set.of('a','e','i','o','u');

        int j=0;
        for(int i=s.length()-1; i>=0; i--){
            if(ch.contains(s.charAt(i))){
                continue;
            }
            else{
                j=i;
                break;
            }
        }
        for(int k=0; k<=j; k++){
            if(k==j && ch.contains(s.charAt(k))){
                break;
            }
            str += s.charAt(k);
        }
        return str;
    }
}