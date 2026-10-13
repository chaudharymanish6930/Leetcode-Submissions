class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr=new long[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        long ans=0;
        int pos=(nums.length+1)/2;
        for(int i=0; i<nums.length; i++){
            if(i<pos){
                ans +=arr[nums.length -1-i];
            }
            else{
                ans -= arr[nums.length-1-i];
            }
        }
        return ans;
    }
}