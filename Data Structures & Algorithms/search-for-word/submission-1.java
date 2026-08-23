class Solution {
    public boolean solve(int r,int c , int index, char[][]board,String word,boolean[][]visited){
        if(index==word.length()){
            return true;
        }
        if(r<0||c<0 || r>=board.length || c>=board[0].length || visited[r][c]){
            return false;
        }
        if(board[r][c]!=word.charAt(index)){
            return false;
        }
        visited[r][c]=true;
        boolean found = solve(r+1,c,index+1,board,word,visited) || solve(r,c+1,index+1,board,word,visited) || solve(r-1,c,index+1,board,word,visited) || solve(r,c-1,index+1,board,word,visited);
        visited[r][c]=false;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][]visited = new boolean[rows][cols];
        for(int r =0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(solve(r,c,0,board,word,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
