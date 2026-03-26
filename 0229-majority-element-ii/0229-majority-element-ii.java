class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int x = n/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int ele : map.keySet()) {
            if(map.get(ele) > x) { //it appears more than n/3 times
                list.add(ele);
            }
        }

        return list; 
    }
}