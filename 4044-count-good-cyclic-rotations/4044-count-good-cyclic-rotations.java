class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length; 
        int half=n/2;
        int count=0;
        long first=0;
        long last=0;
        for(int j=0; j<half; j++){
            first +=nums[j ];
        }
        for(int j=half; j<n; j++){
            last +=nums[j];
        }
        if(first>last){
            count++;
        }

        for(int i=0; i<n-1; i++){
            first=first-nums[i]+nums[(i+half)%n];
            last=last+nums[i]-nums[(i+half)%n];
            if(first>last){
                count++;
            }
        }
        return count;
    }
}