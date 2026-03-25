class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        ArrayList<Integer> list = new ArrayList<Integer>();
        while(left<=right && top <=bottom) {
            //performing right traversal
            for(int i=left;i<=right;i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //performing down traversal
            for(int i=top;i<=bottom;i++) {
                list.add(matrix[i][right]);
            }
            right--;

            //performing left traversal
            //perfomr the left traversal if the given example has row>1
            if(top <= bottom) {
                 for(int i=right;i>=left;i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }

            //performing top traversal
            //check when traversal has ended ex:-we are at ele 5 so we will check for left and right
            if(left <= right){
                for(int i=bottom;i>=top;i--) {
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
    return list;
    }
}