import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[nums.length-k +1];
        for(int i=0;i<nums.length;i++) {

            //check if the first index in the deque is out of window
            if(!dq.isEmpty() && dq.peekFirst() <= i-k) { //true then remove that index
                dq.pollFirst();
            }

            //remove all the elements less than the new element from the nums array- wants max
            //remove from back
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            //Add current index
            dq.offerLast(i);

            //check for new window formation
            if( i>=k-1) { //new window is formed
                //store the first element from deque in the resulted array
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}