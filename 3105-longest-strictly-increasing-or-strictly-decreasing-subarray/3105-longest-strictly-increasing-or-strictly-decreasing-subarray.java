class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int count=1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>nums[j-1]){
                    count++;
                }
                else{
                    break;
                }
            }
            max =Math.max(max,count);
        }
        for(int i=0; i<nums.length; i++){
            int count=1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[j-1]){
                    count++;
                }
                else{
                    break;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}