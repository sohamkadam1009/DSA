class Solution {
    public boolean search(int[] nums, int target) {
         int low = 0, high = nums.length - 1;
        while(low <= high) { //using binary serach o (log n)
            //calculate mid
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return true;
            //the duplicates creates problem of deciding whether the left half is sorted or not to solve that problem we check if low,mid and high elements are same them squeeze the serach space from left and right by one
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            //check if the left half is sorted or not
            if(nums[low] <= nums[mid]) { //yes
                //then check the two boundries of the left half if the element lies in between those elements then we will coninue the serach in the left half only
                if(nums[low] <= target && target < nums[mid]) {
                    //if yes then update the high to squeeze the serach space to the left
                    high = mid - 1;
                } else {
                    //if not then move to the right half
                    low = mid + 1;
                }
            } else {
                //the right half is sorted check the element inside that half
                if(nums[mid] < target && target <= nums[high]) {
                    //if yes the element exists in the right half update the low
                    low = mid + 1;
                } else {
                    //the element exists in the first half update the high
                    high = mid - 1;
                }
            }
        } 
        //element doesn't exists return -1
        return false;
    }
}