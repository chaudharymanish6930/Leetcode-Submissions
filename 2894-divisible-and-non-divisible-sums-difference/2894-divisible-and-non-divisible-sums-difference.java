class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0;
        for(int i=0; i<=n; i++){
            if(i%m!=0){
                sum1 +=i;
            }
        }
        int sum2=0;
        for(int j=0; j<=n; j++){
            if(j%m==0){
                sum2+=j;
            }
        }
        return sum1-sum2;
    }
}