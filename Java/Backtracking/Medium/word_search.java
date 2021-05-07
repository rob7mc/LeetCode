/*
    Description:
    
    Given an m x n grid of characters board and a string word, return true if word 
    exists in the grid.

    The word can be constructed from letters of sequentially adjacent cells, where 
    adjacent cells are horizontally or vertically neighboring. The same letter cell 
    may not be used more than once.

    Example 1:

    Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    Output: true

    Example 2:

    Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
    Output: true

    Example 3:

    Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
    Output: false

    Constraints:

    m == board.length
    n = board[i].length
    1 <= m, n <= 6
    1 <= word.length <= 15
    board and word consists of only lowercase and uppercase English letters.
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null){
            return false;
        }
        
        int m = board.length;
        int n = board[0].length;
        boolean answer = false;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dfs(board, word, i, j, 0)){
                    answer = true;
                }
            }
        }
        
        return answer;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int k){
        int m = board.length;
        int n = board[0].length;
        
        if(i<0 || i>=m || j<0 || j>=n){
            return false;
        }
        
        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            board[i][j] = 'X';
            if(k == word.length()-1){
                return true;
            }
            else if(dfs(board, word, i+1, j, k+1) || dfs(board, word, i-1, j, k+1) || 
                    dfs(board, word, i, j+1, k+1) || dfs(board, word, i, j-1, k+1)){
                return true;
            }
            
            board[i][j] = temp;
        }
        return false;
    }
}