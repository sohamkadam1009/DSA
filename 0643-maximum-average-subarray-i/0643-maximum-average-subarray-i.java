class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avgSum = 0;
        double maxAvgSum = 0;

        //traversing and calculating the avg of first window
        for(int i=0;i<k;i++) {
            avgSum += nums[i];
        }
        //initially maxAvgSum will be avgSum 
        maxAvgSum =avgSum;

        //window displacement by +1 to the right and -1 to the left
        for(int i=k;i<nums.length;i++) {
            avgSum = avgSum - nums[i-k] + nums[i];
            //find maxAvgSum
            maxAvgSum = Math.max(maxAvgSum, avgSum); 
        }

        return maxAvgSum/k;
    }
}