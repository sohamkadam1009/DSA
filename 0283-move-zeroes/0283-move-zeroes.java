class Solution {
    public void moveZeroes(int[] nums) {
        //step1->find the first 0 in the array j will track the zero's and i will track the non-zero's 
        int n = nums.length;
        
        int j = -1;
        for(int i=0;i<n;i++) {
            if(nums[i]==0) {
                j = i;
                break;
            }
        }
        if(j==-1) return;
        //now the j points to the first zero in the array

        for(int i=j+1;i<n;i++) {
            if(nums[i]!=0) {
                //swap
                swap(nums, i, j);
                j++;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}