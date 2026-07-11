class Solution {
    public String removeDigit(String number, char digit) {
        int j=-1;
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)==digit){
                j=i;
                
                if(i+1<number.length() && number.charAt(i+1)>digit){
                    break;
                }
            }

        }
        
        return number.substring(0, j)+ number.substring(j+1);
    }
}