class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
           int m = matrix.length;
           int n = matrix[0].length;
           
           int start = 0;
           int end = m*n-1;

        //   treat is at 1D array 
        while(start <=end){
            int mid = start +(end-start)/2;

            // convert it into 2D element
            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                start = mid+1;
            } else{
                end =mid -1;
            }
        }
           
        
        return false;
    }
}