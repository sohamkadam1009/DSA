class Solution {
    public int[][] merge(int[][] intervals) {

        //sort the intervals array first
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //using list
        List<int[]> list = new ArrayList<>();

        for(int[] interval : intervals) {
            if(list.isEmpty() || interval[0] > list.get(list.size()-1)[1]) {
                //add the new block
                list.add(interval);
            }else { //overlapping update the previous blocks 1st index
                int end = Math.max(list.get(list.size()-1)[1], interval[1]);
                list.get(list.size()-1)[1] =  end;
            }
        }
        //coonvert list into 2d array
        return list.toArray(new int[list.size()][]);
        
    }
}