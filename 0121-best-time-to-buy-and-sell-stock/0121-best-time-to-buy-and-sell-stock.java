class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++) {
            min = Math.min(min,nums[i]);
            maxProfit = Math.max(maxProfit, nums[i] - min); 
        }

        return maxProfit;
    }
}