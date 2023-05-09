/*
Runtime
0 ms
Beats
100%
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix[0].length, colEnd = matrix.length;
        while(rowStart<rowEnd && rowStart<colEnd){
            for(int i=rowStart; i<rowEnd; i++) ans.add(matrix[rowStart][i]);
            for(int j=rowStart+1; j<colEnd; j++) ans.add(matrix[j][rowEnd-1]);
            if(rowStart<colEnd-1){
                for(int k=rowEnd-2; k>=rowStart; k--) ans.add(matrix[colEnd-1][k]);
            }
            if(rowStart<rowEnd-1){
                for(int l=colEnd-2; l>=rowStart+1; l--) ans.add(matrix[l][rowStart]);
            }
            rowStart++;
            rowEnd--;
            colEnd--;
        }
        return ans;
    }
}
