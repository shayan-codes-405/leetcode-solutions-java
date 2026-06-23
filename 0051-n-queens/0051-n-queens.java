import java.util.*;
class Solution {
    List<List<String>> ans = new ArrayList<>();
    Set<Integer> cols = new HashSet<>();
    Set<Integer> diag1 = new HashSet<>();// row - col

    Set<Integer> diag2 = new HashSet<>();// row+col
    
   //yaha pe hmne chessboard ki creation ki hai

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        backtrack(0 , n, board);
        return ans;
        
    }
    private void backtrack(int row, int n, char[][] board){
        if(row == n){ // base case
           List<String> temp = new ArrayList<>();

           for(char[] r : board){
            temp.add(new String(r));
           }

           ans.add(temp);
           return;
        }

        for(int col= 0; col < n; col++ ){
            if(cols.contains(col) || 
               diag1.contains(row - col) ||
               diag2.contains(row + col))
               continue;

            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            board[row][col] = 'Q';

            backtrack(row + 1, n, board);

            cols.remove(col);
            diag1.remove(row-col);
            diag2.remove(row + col);
            board[row][col] = '.';
        }
    }
}