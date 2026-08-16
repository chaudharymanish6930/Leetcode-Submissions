class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int count=0; 
        for(int i=0; i<nums.length; i++){
            for(int j=i+2; j<nums.length; j++){
                int diff = nums[i+1]-nums[i];
                boolean check=true;
                for(int k=i+2; k<=j; k++){
                    if(nums[k]-nums[k-1] != diff){
                        check=false;
                        break;
                    }
                }
                if(check){
                    count++;
                }
            }
        }
        return count;
    }
}