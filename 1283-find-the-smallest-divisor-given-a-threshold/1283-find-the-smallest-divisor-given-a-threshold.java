class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //find max,use binary serach from 1 to max
        int low = 1, high = findMax(nums);
        
        int ans = Integer.MAX_VALUE; 

        while(low <= high) {
            int sum = 0;
            //find the mid = divisor 
            int mid = low + (high - low) / 2;
            for(int i=0; i < nums.length;i++) {
                int result = (int) Math.ceil((double) nums[i] / (double) mid);
                sum+=result;
            }

            if(threshold >= sum) {
                ans = mid;
                //update the low
                high = mid - 1;
            } else {
                //update the high
                low = mid + 1;
            }
        }

        return ans;
    }

    public int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }

        return max;
    }
}