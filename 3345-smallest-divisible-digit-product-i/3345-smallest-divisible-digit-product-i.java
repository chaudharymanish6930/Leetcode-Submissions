class Solution {
    public int digitMul(int n){
        int pro=1;
        while(n>0){
            int x=n%10;
            pro *=x;
            n=n/10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitMul(n)%t == 0){
                return n;
            }
            n++;
        }
    }
}