import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //using hashmap to store the frequency/count of each number and priority queue to to sort and store it in decreasing order so we can get top k elements

        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] result = new int[k];

        for(Integer num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        pq.addAll(freq.keySet());

        for(int i=0;i<k;i++) {
            result[i] = pq.poll();
        }

    return result;
    }
}