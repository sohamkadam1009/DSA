class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //optimal solution
        //using three pointers i,j and k
        //arraylist of arraylist to return the ans
        List<List<Integer>> list = new ArrayList<>();
        int n= nums.length;

        //sort the array first using collection.sort
        Arrays.sort(nums);

        for(int i=0;i<n;i++) {
            if(i>0 && nums[i] == nums[i-1]) continue; //if current and previous elements are same then continue starting from 1st index
            //init the remaining two pointers j and k
            int j = i+1;
            int k = n-1;

            //loop until the two pointers j and k doesn't crosses each other
            while(j<k) {
                //calculate sum
                int sum = nums[i] + nums[j] + nums[k];

                //three cases arise if sum > 0, sum < 0 and sum==0
                if(sum < 0) {
                    //move left pointer j to +1;
                    j++;
                } else if(sum > 0) {
                    //move right pointer k to -1
                    k--;
                } else { //sum is zero
                    //add that list of three elements to the list
                    // int[] temp = {nums[i], nums[j], nums[k]};
                    // list.add(temp);
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    //move left and right pointer (j and k) to +1 and -1 respectively
                    j++;
                    k--;
                    //now move pointer j and k till they are not same as the previous elements -> take care that array index shouldn't get out of bound
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return list;
    }
}