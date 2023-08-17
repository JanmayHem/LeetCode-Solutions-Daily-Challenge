/* Runtime: 14 ms
Beats 74.76%of users with Java
Memory: 45.40 mb
Beats 85.31%of users with Java */

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat==null || mat.length==0 || mat[0].length==0) return mat;
        int n = mat.length, m = mat[0].length;
        int[][] ans = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==0){
                    ans[i][j]=0;
                    q.offer(new int[] {i,j});
                }
                else ans[i][j]=Integer.MAX_VALUE;
            }
        }
        int[][] moves = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int x=cell[0], y=cell[1];
            for(int[] move: moves){
                int nx = x+move[0];
                int ny = y+move[1];
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(ans[nx][ny]>ans[x][y]+1){
                        ans[nx][ny] = ans[x][y]+1;
                        q.offer(new int[] {nx,ny});
                    }
                }
            }
        }
        return ans;
    }
}
