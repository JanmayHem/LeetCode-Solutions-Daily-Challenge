/*
Runtime: 0 ms Beats 100%
Memory: 39.7 MB Beats 86.77%
*/

class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zeros=0, startR=0, startC=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) zeros++;
                else if(grid[i][j] == 1) {
                    startR=i; 
                    startC=j;
                }
            }
        }
        return dfs(grid, startR, startC, zeros);
    }

    public int dfs(int [][]grid, int x, int y, int Zeros){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==-1) return 0;
        if(grid[x][y]==2) return Zeros == -1 ? 1 : 0;
        grid[x][y]=-1;
        Zeros--;
        int paths = dfs(grid,x+1,y,Zeros) + dfs(grid,x-1,y,Zeros) + dfs(grid,x,y+1,Zeros) + dfs(grid,x,y-1,Zeros); 
        grid[x][y]=0;
        Zeros++;
        return paths;
    }
}
