class Solution {
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                list.add(s.charAt(i)- '0');
            }
        }
        if(list.size()<2) return -1;

        Collections.sort(list);
        int largest=list.get(list.size()-1);
        // check unique
        for(int i=list.size()-2; i >= 0; i--) {
            if (list.get(i) != largest) {
                return list.get(i);
            }
        }
        return -1;
    }
}