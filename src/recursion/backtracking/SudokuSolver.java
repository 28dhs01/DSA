package recursion.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

        int [][]board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        sudoku(board,0,0);
    }
    static void sudoku(int [][]board , int row , int col ){
        // base condition
        if( row == board.length ){
            displayBoard(board);
            return ;
        }
        if( col == board.length ){
            sudoku(board,row+1,0);
            return ;
        }
        if( board[row][col] == 0 ){
            for( int num = 1 ; num<=9 ; num++ ){
                if( isSafe(board,row, col, num )){
                    board[row][col] = num;
                    sudoku(board,row,col+1);
                    board[row][col] = 0 ;
                }
            }
        }else {
            sudoku(board,row,col+1);
        }
    }

    private static void displayBoard(int[][] board) {
        for(int[]row : board ){
            for( int element: row ){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe( int[][]board,int row, int col, int number ){
        // check all the row of particular col
        for( int i = 0 ; i< board.length; i++ ){
            if( board[i][col] == number ){
                return false ;
            }
        }

        // check all the col of particular row
        for( int i = 0 ; i< board.length; i++ ){
            if( board[row][i] == number ){
                return false ;
            }
        }

        //check in particular block
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt ;
        int colStart = col - col%sqrt ;
        for( int r = rowStart ; r<rowStart+sqrt ; r++ ){
            for( int c = colStart ; c<colStart+sqrt ; c++ ){
                if( board[r][c] == number ){
                    return false ;
                }
            }
        }

        return true ;

    }
}
