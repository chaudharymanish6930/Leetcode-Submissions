class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            max= Math.max(max, n);
        }
        for(int n:nums){
            count += (max-n);
        }
        return count;
    }
}