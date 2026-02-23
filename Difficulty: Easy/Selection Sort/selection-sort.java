class Solution {
    void selectionSort(int[] arr) {
        // code here
        int minIndex;
        int temp;
        for(int i=0;i<arr.length-1;i++) {
            minIndex = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j; //updating the index of the smallest element
                }
            }
            
            //swap those elements
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        // System.out.println(arr);
    }
    
}