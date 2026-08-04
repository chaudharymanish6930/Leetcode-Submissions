class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        int[] arr=new int[max+1];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]=-1;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min; i<arr.length; i++){
            if(arr[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}