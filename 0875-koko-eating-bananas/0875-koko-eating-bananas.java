class Solution {
    public int minEatingSpeed(int[] piles, int h) {
           //finding high from piles array
           int ans = Integer.MAX_VALUE;
           int high = Integer.MIN_VALUE;
           for(int i=0;i<piles.length;i++) {
                if(piles[i] >= high) {
                    //update high
                    high = piles[i];
                }
           }
           int low = 1;
            //performing bs
           while(low<=high) {
            //mid
            int selectedBananas = low + (high - low)/2;
            long TotalHrs = calculateTotalhrs(piles,selectedBananas);
            if(TotalHrs <= h) {
                //update the ans
                ans = Math.min(ans, selectedBananas);
                //move high
                high = selectedBananas - 1;
            } else {
                //update the low
                low = selectedBananas + 1;
            }
           }
           return ans;
    }

    public long calculateTotalhrs(int[] piles, int selectedBananas) {
        long totalHrs = 0;
        for(int i =0; i<piles.length;i++) {
            totalHrs += (int) Math.ceil((double) piles[i] / (double) selectedBananas);
        }

        return totalHrs;
    }
}