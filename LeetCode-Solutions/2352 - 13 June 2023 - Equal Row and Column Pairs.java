/*
Memory: 48.3 MB Beats 83.67%
*/

class Solution {
    public int equalPairs(int[][] grid) {
        int oneRow=0, total=0;
        int n = grid.length, m = grid[0].length;
        for(int[] row: grid){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++) if(row[j]==grid[j][i]) oneRow++;
                if(oneRow==n) total++;
                oneRow=0;
            }
        }
        return total;
    }
}
