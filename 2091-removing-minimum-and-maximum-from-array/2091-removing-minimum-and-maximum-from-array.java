class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        
        int minI=0;
        int maxI=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<nums[minI]){
                minI=i;
            }
            if(nums[i]>nums[maxI]){
                maxI=i;
            }
        }
        int j=Math.min(minI, maxI);
        int k=Math.max(minI, maxI);

        int x=k+1;
        int y=nums.length-j;
        int z=(j+1)+(nums.length-k);

        return Math.min(x, Math.min(y,z));
    }
}