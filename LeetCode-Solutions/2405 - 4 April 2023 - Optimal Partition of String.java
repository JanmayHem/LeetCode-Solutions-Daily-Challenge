/*
Runtime: 5 ms Beats 99.79%
Memory: 42.8 MB Beats 80.85%
*/

class Solution {
    public int partitionString(String s) {
        int map = 0, count = 1;
        for(char c: s.toCharArray()){
            if((map & (1<<c)) != 0) {
                count++;
                map = 0;
            }
            map ^= (1<<c);
        }
        return count;
    }
}
