class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = returnStarting(nums, target, 0, nums.length-1);
        int last = returnEnding(nums, target, 0, nums.length-1);
       
        return new int[]{first,last} ;
    }

    public int returnStarting(int[] nums, int target, int low, int high) {
        if(low <= high) {
            int mid = low + (high-low)/2;
            if(target == nums[mid]) {
                //sreach in the left space for first occurence
                //update the high if left occurence found return left else return current element's occurenece which is mid
                int left = returnStarting(nums, target, low, mid - 1);
                if (left != -1) {
                    return left;
                }
                return mid;   
            }
            if(target < nums[mid]) {
                //sreach in the left space occurence
                //update the high
                return returnStarting(nums, target, low, mid - 1);
            }
            //the target element might be in the right serach space
            //update low
            return returnStarting(nums, target, mid+1,high);
            
        }

        return -1;
    }

    public int returnEnding(int[] nums, int target, int low, int high) {
        if(low <= high) {
            int mid = low + (high-low)/2;
            if(target == nums[mid]) {
                int right = returnEnding(nums, target, mid+1, high);
                if(right!=-1){
                    return right;
                }
                return mid;
            }
            if(target < nums[mid]) {
                //sreach in the left space for first occurence
                //update the high
                return returnEnding(nums, target, low, mid - 1);
            }
            //the target element might be in the right serach space
            //update low
            return returnEnding(nums, target, mid+1,high);
        }

        return -1;
    }
}