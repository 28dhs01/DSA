package recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(mazeCount(3,3));
        //paths("",3, 3);
        //System.out.println(pathsRet("",3, 3));
        //System.out.println(pathRetDiagonal("",3, 3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathObstacles("",board,0,0);
    }
    static int mazeCount(int r, int c){
        // base condition
        if( r == 1 || c == 1 ){
            return 1 ;
        }

        // body and calls

        int left =  mazeCount(r-1,c);
        int right = mazeCount(r,c-1 );
        return left+right ;
    }
    static void paths(String p , int r, int c ){
        // base condition
        if( r == 1 && c == 1 ){
            System.out.println(p);
            return ;
        }
        // body and calls
        if( r > 1 ){
            paths(p+'D', r-1, c);
        }
        if( c > 1 ){
            paths( p+'R', r, c-1);
        }
    }
    static ArrayList<String> pathsRet(String p, int r, int c){
        // base condition
        if( r == 1 && c==1 ){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        // local list
        ArrayList<String> ans = new ArrayList<>();
        if( r>1 ){
            ans.addAll(pathsRet(p+'D',r-1,c));
        }
        if( c > 1){
            ans.addAll(pathsRet(p+'R',r,c-1));
        }
        return ans ;
    }
    static ArrayList<String> pathRetDiagonal(String p , int r, int c ){
        // base condition
        if( r == 1 && c == 1 ){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        // body and calls
        ArrayList<String> ans = new ArrayList<>(); // this is my local list
        if( r > 1 ){
            ans.addAll(pathRetDiagonal(p+'V',r-1,c));
        }
        if( c > 1 ){
            ans.addAll(pathRetDiagonal(p+'H',r,c-1));
        }
        if( r > 1 && c > 1){
            ans.addAll(pathRetDiagonal(p+'D',r-1, c-1));
        }
        return ans ;
    }
    static void pathObstacles(String p ,boolean[][]maze , int r, int c ){
        // base condition
        if( r == maze.length-1 && c == maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        // body and calls
        if( maze[r][c] == false ){
            return;
        }
        if( r < maze.length - 1 ){
            pathObstacles(p+'V',maze,r+1,c);
        }
        if ( c < maze[0].length-1 ){
            pathObstacles(p+'H',maze,r,c+1);
        }
    }
}
