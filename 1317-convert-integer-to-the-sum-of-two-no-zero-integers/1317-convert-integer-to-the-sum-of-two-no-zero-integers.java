class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1; i<n; i++){
            int b=n-i;
            if(isNoZero(i) && isNoZero(b)){
                return new int[]{i,b};
            }
        }
        return new int[]{};
    }

    private boolean isNoZero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}