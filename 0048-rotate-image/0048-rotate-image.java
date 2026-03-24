class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr[i].length;j++) {
                    System.out.println(i +"  " + j);
                    swap(arr,i,j);
               
            }
        }

        for(int[] row : arr) {
            for(int i=0;i<row.length / 2;i++) {
                reverseRow(row, i);
            }
        }
    }

     public void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    
   
    
    public void reverseRow(int[] row, int i) {
        int temp = row[i];
        row[i] = row[row.length - 1  - i];
        row[row.length - 1  - i] = temp;
    }
}