import java.util.*;
public class NQueens {

        //check if placing a queen is safe
        public static boolean isSafe(List<String> board, int row, int col, int n) {
            
            //check vertical
            for(int i =0; i <row; i++){
                if(board.get(i).charAt(col) == 'Q')return false;
            }

            //check upper left diagonal
            for(int i = row-1, j=col-1; i>=0 && j>=0; i--, j--) {
                if(board.get(i).charAt(j) == 'Q')return false;
            }

            //check upper right diagonal
            for(int i = row-1, j = col+1; i>=0 && j<n; i--, j++) {
                if(board.get(i).charAt(j) == 'Q')return false;
            }
            return true;
        }

        //recursive backtracking
        public static void nQueens(List<String> board, int row, int n, List<List<String>>ans) {
            if(row == n) {
                ans.add(new ArrayList<>(board));    //store solution
                return;
            }

            for(int col = 0; col<n; col++) {
                if (isSafe(board, row, col, n)) {
                    //place Queen
                    char[] rowArray = board.get(row).toCharArray();
                    rowArray[col] = 'Q';
                    board.set(row, new String(rowArray));

                    nQueens(board, row+1, n, ans);

                    //backtrack
                    rowArray[col] = '.';
                    board.set(row, new String(rowArray));
                }
            }
        }

        public static List<List<String>> solveNQueens(int n) {
            List<String> board = new ArrayList<>();
            for(int i = 0; i < n; i++){
                char[] row = new char[n];
                Arrays.fill(row,'.');
                board.add(new String(row));
            }
            
            List<List<String>> ans = new ArrayList<>();
            nQueens(board, 0, n, ans);
            return ans;
        }

        public static void main(String[] args) {
            int n = 4;
            List<List<String>> solutions = solveNQueens(n);

            for(List<String> sol : solutions) {
                for(String row : sol) {
                    System.out.println(row);
                }
                System.out.println();
            }
        }
    }

