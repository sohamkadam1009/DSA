import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //base case example nums=[3,4] k=7 then 7(sum)-7 will be 0 and at key 0 the value should be 
        //1
        //{sum,freq}
        map.put(0,1);
        Integer sum = 0;
        Integer count = 0;
        for(Integer num : nums) {
            sum+=num;
            //if the (sum -k) exists then inc the count by 1
            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}