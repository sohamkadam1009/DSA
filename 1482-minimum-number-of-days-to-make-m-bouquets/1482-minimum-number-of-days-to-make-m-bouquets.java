class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k) return -1;

        int high = findMax(bloomDay);
        int low = 1;
        int ans = Integer.MAX_VALUE;

        while(low<=high) {
            //mid
            int selectedDay = low + (high - low) / 2;
            int noOfBouquets = totalBouquets(bloomDay, selectedDay, k);

            if(noOfBouquets >= m) {
                ans = Math.min(ans, selectedDay);
                high = selectedDay - 1;
            } else {
                low = selectedDay + 1;
            }
        }
        return ans;
    }

    public int totalBouquets(int[] bloomDay, int selectedDay, int k) {
        int count = 0, total = 0;
        for(int day : bloomDay) {
            if(day <= selectedDay) {
                count++;
                continue;
            }
                total += count / k;
                count = 0;
        }
        total += count / k;
        return total;
    }
    public int findMax(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for(int day : bloomDay) {
            max = Math.max(max, day);
        }
        return max;
    }
}