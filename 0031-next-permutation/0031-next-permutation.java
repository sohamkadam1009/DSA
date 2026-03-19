class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for(int i = n - 2;i >= 0;i--) {
            if(nums[i] < nums[i+1]) {
                //pivot found
                pivot = i;
                break;
            }
        }

        //handling the edge case suppose the permutation of input is the greatest number then reverse the arra
        if(pivot == -1) {
            reverseArr(nums,0,n-1);
            return;
        }

        //finding the right most element
        for(int i=n-1;i>pivot;i--) {
            if(nums[i] > nums[pivot]) {
                //swap that i ele with pivot ele
                swap(nums,i,pivot);
                break;
            }
        }

        //reverse the elements from n-1 to pivot+1
        reverseArr(nums,pivot+1,n-1);

    }

    public void reverseArr(int[] nums, int start, int end) {
        while(start <= end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}