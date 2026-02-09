import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer sum=0;
        Integer prevIndex,rem;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            rem = sum % k;
            if(map.containsKey(rem)) {
                prevIndex = map.get(rem);
                if(i-prevIndex > 1) return true;
            } else map.put(rem,i);
        }

        return false;
    }
}