class Solution {
    public boolean digitCount(String num) {
        int n=num.length();

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++) {
                if((num.charAt(j)-'0') == i) {
                    count++;
                }
            }
            if(count != (num.charAt(i)-'0')) {
                return false;
            }
        }
        return true;
    }
}