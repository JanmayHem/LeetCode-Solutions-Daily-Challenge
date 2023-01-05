/*
Runtime: 67 ms Beats 96.69%
Memory: 79.8 MB Beats 75.29%
*/

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int count = 0, limit = -1;
        for (int[] i: points) {
            if (count==0 || i[0]>limit) {
                limit=i[1];
                ++count;
            }
        }
        return count;
    }
}
