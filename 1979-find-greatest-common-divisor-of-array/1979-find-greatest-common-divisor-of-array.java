class Solution {
    public int findGCD(int[] nums) {
        int max =nums[0];
        int min =nums[0];
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        for(int num=min; num>0; num--){
            if(max%num==0 && min%num==0){
                return num;
            }
        }
        return 1;
    }
}