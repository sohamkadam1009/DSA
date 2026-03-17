class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {
            //if its 0 then swap the mid ele with low ele and inc mid and low by 1
            if(nums[mid] == 0) {
                swap(nums,mid,low);
                low++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums,mid,high);
                high--;
            } else {
                mid++;
            }
        }
    }

    public void swap(int[] nums, int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}