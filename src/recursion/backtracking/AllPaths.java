package recursion.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        //allPaths("",board,0,0);

        int[][] path = new int[board.length][board[0].length] ;
        allPathsPrintingMatrix("",board,0,0,path, 1);
    }
    static void allPaths(String p , boolean[][] maze , int r , int c ){
        // base condition
        if( r == maze.length-1 && c == maze.length-1 ){
            System.out.println(p);
            return;
        }
        // body and calls

        if( maze[r][c] == false){
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false ;
        if( r < maze.length - 1 ){
            allPaths(p+'D',maze,r+1,c);
        }
        if( c < maze.length - 1){
            allPaths(p+'R',maze,r,c+1);
        }
        if( r > 0 ){
            allPaths(p+'U',maze,r-1,c);
        }
        if( c > 0 ){
            allPaths(p+'L',maze,r,c-1);
        }
        // this is the line where the function will be over
        // so before the function gets removed also remove the changes that were made
        maze[r][c] = true ;
    }
    static void allPathsPrintingMatrix(String p , boolean[][] maze, int r, int c, int[][]path, int steps){
        // base condition
        if( r == maze.length -1 && c == maze[0].length - 1){
            path[r][c] = steps ;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        // body and calls
        if( maze[r][c] == false ){
            return;
        }
        maze[r][c] = false ;
        path[r][c] = steps ;
        if( r < maze.length-1){
            allPathsPrintingMatrix(p+'D',maze,r+1,c,path,steps+1);
        }
        if( c < maze[0].length-1){
            allPathsPrintingMatrix(p+'R',maze,r,c+1, path,steps+1);
        }
        if( r> 0 ){
            allPathsPrintingMatrix(p+'U',maze,r-1, c,path,steps+1);
        }
        if( c> 0){
            allPathsPrintingMatrix(p+'L',maze,r, c-1,path,steps+1);
        }
        maze[r][c] = true;
        path[r][c] = 0 ;
    }
}
