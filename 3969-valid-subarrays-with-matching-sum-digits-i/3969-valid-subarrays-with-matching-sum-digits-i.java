class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            long sum=0;
            for(int j=i; j<nums.length; j++){
                sum +=nums[j];

                if(sum%10!=x) continue;

                long first=sum;
                while(first>=10){
                    first /=10;
                }

                if(first==x){
                    count++;
                }
            }
        }
        return count;
    }
}