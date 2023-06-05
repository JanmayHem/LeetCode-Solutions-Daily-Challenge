/*
Runtime: 0 ms Beats 100%
Memory: 42.6 MB Beats 29.98%
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        float slope1, slope2;
        if((coordinates[1][0]-coordinates[0][0]) == 0) slope1 = Float.MAX_VALUE;
        else slope1 = (float)(coordinates[1][1]-coordinates[0][1]) / (coordinates[1][0]-coordinates[0][0]);
        for(int i=2; i<coordinates.length; i++) {
            if((coordinates[i][0]-coordinates[i-1][0]) == 0) slope2 = Float.MAX_VALUE;
            else slope2 = (float)(coordinates[i][1]-coordinates[i-1][1]) / (coordinates[i][0]-coordinates[i-1][0]);
            if(slope1!=slope2) return false;
        }
        return true;
    }
}
