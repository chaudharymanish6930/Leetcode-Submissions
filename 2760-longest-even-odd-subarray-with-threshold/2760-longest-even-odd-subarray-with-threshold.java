class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n=nums.length;
        int ans=0;

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if (isValid(nums,i,j,threshold)) {
                    ans = Math.max(ans, j-i + 1);
                }
            }
        }
        return ans;
    }

    private boolean isValid(int[] nums, int l, int r, int threshold) {
        if(nums[l] % 2 != 0)
            return false;

        for(int i=l; i<=r; i++) {
            if(nums[i] > threshold)
                return false;

            if(i<r && nums[i] % 2 == nums[i + 1] % 2)
                return false;
        }

        return true;
    }
}