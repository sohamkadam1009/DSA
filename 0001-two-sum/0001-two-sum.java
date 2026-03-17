class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int complement;
        //using complement to solve the question hash map will store the num:index
        for(int i=0;i<nums.length;i++) {
            complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            //store the values in map
            map.put(nums[i], i);
        }

        return new int[] {-1,-1};
    }
}