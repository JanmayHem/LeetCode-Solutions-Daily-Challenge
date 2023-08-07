/*
Runtime: 0 ms
Beats 100.00%of users with Java

Memory: 41.45 mb
Beats 17.14%of users with Java
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int left=0, right=row*col-1;
        while(left<=right){
            int mid = (left+right)/2;
            int val = matrix[mid/col][mid%col];
            if(val == target) return true;
            else if(val<target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
