class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        int[] freq=new int[10];
        for(int i:digits){
            freq[i]++;
        }

        for(int i=100; i<=998; i+=2){
            int hun=i/100;
            int ten=(i/10)%10;
            int uni=i%10;

            int[] curr=new int[10];
            curr[hun]++;
            curr[ten]++;
            curr[uni]++;

            boolean isValid=true;
            for(int j=0; j<10; j++){
                if(curr[j]>freq[j]){
                    isValid=false;
                    break;
                }
            }

            if(isValid){
                count++;
            }
        }

      
        return count;
    }
}