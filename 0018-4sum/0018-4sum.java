class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         //optimal solution
        //using three pointers i,j, k and l
        //arraylist of arraylist to return the ans
        List<List<Integer>> list = new ArrayList<>();
        int n= nums.length;

        //sort the array first using collection.sort
        Arrays.sort(nums);

        for(int i=0;i<n-1;i++) {
             //if current and previous elements are same then continue starting from 1st index
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n;j++) {
                // if current and previous elements are same then continue for every i
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                //init the remaining two pointers k and l
                int k = j+1;
                int l = n-1;
                //loop until the two pointers k and l doesn't crosses each other
                while(k<l) {
                    //calculate sum
                    // long long sum = nums[i] + nums[j];
                    long sum = (long) nums[i] + nums[j];
                    sum+=nums[k];
                    sum+=nums[l];

                    //three cases arise if sum > target, sum < target and sum==target
                    if(sum < target) {
                        //move left pointer k to +1;
                        k++;
                    } else if(sum > target) {
                        //move right pointer l to -1
                        l--;
                    } else { //sum is equl to target
                        //add that list of four elements to the list
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        //move left and right pointer (k and l) to +1 and -1 respectively
                        k++;
                        l--;
                        //now move pointer k and l till they are not same as the previous elements -> take care that array index shouldn't get out of bound
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                }

            }
        }
        return list;
    }
}


