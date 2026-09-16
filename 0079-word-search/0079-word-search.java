class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        char[] word_Array = word.toCharArray();
        for(int i =0; i<m; i++){
            for(int j= 0; j<n; j++){
                if(board[i][j] == word_Array[0] && find(board, i, j, word_Array, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board, int i, int j, char[] word, int idx){
        int m = board.length;
        int n = board[0].length;

        if(idx == word.length){
            return true;
        }
        //   Base condition
        if(i<0 || j<0 || i>=m || j>=n || board[i][j] != word[idx] || board[i][j] =='$'){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '$';

        boolean res = find(board, i-1, j, word, idx+1)||
                      find(board, i+1, j, word, idx+1)||
                      find(board, i, j+1, word, idx+1)||
                      find(board, i, j-1, word, idx+1);
                      board[i][j] = temp;
        return res;

    }
}