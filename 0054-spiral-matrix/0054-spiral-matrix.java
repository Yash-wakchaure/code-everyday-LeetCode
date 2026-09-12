class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int srow = 0, erow = m-1;
        int scol = 0, ecol = n-1;
         
        while(srow <= erow && scol <= ecol){
            // top
            for(int j = scol; j<=ecol; j++){
                ans.add(matrix[srow][j]);
            }
            // right
            for(int i = srow+1; i<=erow; i++){
                ans.add(matrix[i][ecol]);
            }
            // bottom
            for(int j = ecol-1; j>=scol; j--){
                if(srow == erow){
                    break;
                }
                ans.add(matrix[erow][j]);
            }
            // left
            for(int i = erow-1; i>srow; i--){
                if(scol == ecol){
                    break;
                }
                ans.add(matrix[i][scol]);  
            }

            srow++; ecol--; erow--; scol++;
        } 
        return ans; 
    }
}