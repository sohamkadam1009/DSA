import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {

    Integer majorityElement = nums[0];
    Integer halfLength = nums.length / 2;

    //Store the count of each element and check which elemen's count is greater than n/2 times
    HashMap<Integer,Integer> freq = new HashMap<>();
    for(Integer key : nums) {
        freq.put(key,freq.getOrDefault(key,0) + 1);
    }

    for(Integer key : nums) {
        if(freq.get(key) > halfLength) {
            majorityElement = key;
        }
    }
    return majorityElement;
    }
}