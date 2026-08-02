class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int m=Integer.MIN_VALUE;
        int n=Integer.MAX_VALUE;
        for(int x:nums){
            m=Math.max(m,x);
            n=Math.min(n,x);
        }
        return Math.max(0, m-n-2*k);
    }
}