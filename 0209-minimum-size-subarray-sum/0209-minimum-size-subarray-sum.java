class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left =0;
        int length = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right=0;right<nums.length;right++) {
            sum+= nums[right];
            //shrinking from left if the sum gets greater than target
            while(sum>= target) {
                length = right - left + 1;
                minLength = Math.min(length,minLength);
                sum-=nums[left];
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }
}