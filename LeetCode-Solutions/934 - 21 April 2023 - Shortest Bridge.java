/*
Runtime: 7 ms Beats 98.56%
*/

class Solution {
    boolean[][] visited;
    int n;
    public int shortestBridge(int[][] grid) {
        n = grid.length;
        visited = new boolean[n][n];
        boolean flag = false;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j, q);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        return bfs(grid, q);
    }

    private void dfs(int[][] grid, int i, int j, Queue<int[]> q){
        if(i==-1 || j==-1 || i==n || j==n || visited[i][j]) return;
        visited[i][j] = true;
        if(grid[i][j]==0){
            q.add(new int[]{i,j});
            return;
        }
        dfs(grid, i+1, j, q);
        dfs(grid, i-1, j, q);
        dfs(grid, i, j+1, q);
        dfs(grid, i, j-1, q);
    }

    private int bfs(int[][] grid, Queue<int[]> q){
        int x = 0;
        while(!q.isEmpty()){
            int nq = q.size();
            while(nq-- > 0){
                int[] curr=q.remove();
                int i=curr[0], j=curr[1];
                if(grid[i][j]==1) return x;
                if(i+1<n && !visited[i+1][j]){
                    q.add(new int[]{i+1,j});
                    visited[i+1][j]=true;
                }
                if(i-1>=0 && !visited[i-1][j]){
                    q.add(new int[]{i-1,j});
                    visited[i-1][j]=true;
                }
                if(j+1<n && !visited[i][j+1]){
                    q.add(new int[]{i,j+1});
                    visited[i][j+1]=true;
                }
                if(j-1>=0 && !visited[i][j-1]){
                    q.add(new int[]{i,j-1});
                    visited[i][j-1]=true;
                }
            }
            x++;
        }
        return x;
    }
}
