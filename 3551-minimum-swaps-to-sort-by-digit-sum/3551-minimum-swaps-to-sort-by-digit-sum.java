
import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        for(int i=0; i<n; i++) {
            int sum=0;
            int num=nums[i]; 

            while(num>0) {
                sum +=num%10;
                num =num/10;
            }
            ans[i]=sum;
        }

        int[][] arr =new int[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = ans[i];
        }

        Arrays.sort(arr, (a, b)->{
            if (a[1] != b[1]) {
                return a[1]-b[1];
            }
            return a[0] - b[0];
        });

        int swaps=0;
        int[] target=new int[n];

        for(int i=0; i<n; i++) {
            target[i] =arr[i][0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<n; i++) {
            map.put(nums[i], i);
        }

        for(int i=0; i<n; i++) {
            if (nums[i] == target[i]) {
                continue;
            }
            int j = map.get(target[i]);
            map.put(nums[i], j);
            map.put(target[i], i);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            swaps++;
        }

        return swaps;
    }
}
