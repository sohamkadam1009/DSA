import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        //Using hashmap to count freq of each elements and return the element whose freq is 1
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) return key;
        }

        return -1;
    }
}