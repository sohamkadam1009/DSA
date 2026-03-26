class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++) {
            list.add(printRow(i));
        }

        return list;
    }

    public List<Integer> printRow(int n) {
        List<Integer> rowList = new ArrayList<>();
        long ans = 1;
        rowList.add((int)ans);

        //calculate each element of the nth row and add that into rowList
        for(int i=1;i<n;i++) {
            ans *= (n-i);
            ans/=i;
            rowList.add((int)ans);
        }

        return rowList;
    } 
}