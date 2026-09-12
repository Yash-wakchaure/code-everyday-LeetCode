class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(i == j){
                    sum += mat[i][j];
                }
            }
        }
        // Sd
        for (int i = 0; i<mat.length; i++){
            for(int j = mat[0].length-1; j>=0; j--){
                if(i+j == mat.length-1){
                    if (i != mat.length / 2 || j != mat.length / 2) {
                        sum += mat[i][j];
                    }
                }
            }
        }
        return sum;
    }
    
}