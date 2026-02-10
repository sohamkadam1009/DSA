class Solution {
    public int removeDuplicates(int[] nums) {
        // int[] expectedNums = new int[];
        int slow = 0;
        int fast = 1;
        // int totalUnique = 1;

        while(fast<nums.length) {
            //if unique
            if(nums[slow]!=nums[fast]) {
                nums[slow+1] = nums[fast];
                slow++;
                fast++;
                // totalUnique++;
            } else fast++;
        }

        return slow + 1;
    }
}