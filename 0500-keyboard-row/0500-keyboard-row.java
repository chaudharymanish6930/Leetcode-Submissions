class Solution {
    public String[] findWords(String[] words) {
        Set<Character> set1= Set.of('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P');
        Set<Character> set2= Set.of('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L');
        Set<Character> set3=Set.of('z','x','c','v','b','n','m','Z','X','C','V','B','N','M');
        List<String> arr= new ArrayList<>();
        for(String str:words){
            Set<Character> row;
            char first=str.charAt(0);
            if(set1.contains(first)){
                row = set1;
            }else if(set2.contains(first)){
                row = set2;
            }else{
                row = set3;
            }
            boolean valid = true;
            for(int i=0; i<str.length(); i++){
                if(!row.contains(str.charAt(i))){
                    valid=false;
                    break;
                }
            }
            if(valid){
                arr.add(str);
            }
        }

        return arr.toArray(new String[0]);
    }
}