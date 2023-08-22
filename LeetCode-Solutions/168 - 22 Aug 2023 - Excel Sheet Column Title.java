/*
Runtime: 0 ms
Beats 100.00%of users with Java

Memory: 39.30 MB
Beats 91.43%of users with Java
*/

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            ans.insert(0, (char)('A'+(n-1)%26));
            n = (n-1)/26;
        }
        return ans.toString();
    }
}
