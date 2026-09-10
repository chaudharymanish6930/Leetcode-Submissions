class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odd=new int[nums.length/2];
        int x=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                odd[x]=nums[i];
                x++;
            }
        }
        int[] even = new int[nums.length/2];
        x=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                even[x]=nums[i];
                x++;
            }
        }
        int[] ans=new int[nums.length];
        int y=0;
        int z=0;
        for(int i=0; i<nums.length; i++){
            if(i%2!=0){
                ans[i]=odd[y];
                y++;
            }
            else if( i%2==0 ){
                ans[i]=even[z];
                z++;
            }
        }
        return ans;
    }
}