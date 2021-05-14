/*
    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to 
    be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    
    Note:

    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    Only the filled cells need to be validated according to the mentioned rules.
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Columns
        for(int i=0; i<board.length; i++){
            HashSet<Character> set = new HashSet<Character>();
            for(int j=0; j<board.length; j++){
                if(set.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                else if(!set.contains(board[i][j]) && board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
        }
        
        // Rows
        for(int j=0; j<board.length; j++){
            HashSet<Character> set = new HashSet<Character>();
            for(int i=0; i<board.length; i++){
                if(set.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                else if(!set.contains(board[i][j]) && board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
        }
        
        // 3x3 Matrix
        for(int block=0; block<board.length; block++){
            HashSet<Character> set = new HashSet<Character>();
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
			    for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if(set.contains(board[i][j]) && board[i][j] != '.'){
                        return false;
                    }
                    else if(!set.contains(board[i][j]) && board[i][j] != '.'){
                        set.add(board[i][j]);
                    }
                }
            }
        }
        
        return true;
    }
}