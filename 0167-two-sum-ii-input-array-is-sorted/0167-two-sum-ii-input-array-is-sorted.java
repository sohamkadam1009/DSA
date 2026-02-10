import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using hashmap map = {num,index}
        HashMap<Integer,Integer> map = new HashMap<>();
        int complement;

        for(int i=0;i<nums.length;i++) {
            complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement)+1,i+1};
            }

            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}