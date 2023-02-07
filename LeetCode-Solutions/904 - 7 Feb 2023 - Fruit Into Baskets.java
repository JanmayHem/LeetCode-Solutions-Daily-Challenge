/*
Runtime: 6 ms Beats 96.47%
Memory: 50.2 MB Beats 91.49%
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int[] count = new int[n];
        int res = 0, i = 0, j = 0, k = 0;
        while(j < n){
            if(k < 2 || count[fruits[j]] > 0){
                if(count[fruits[j]] == 0) k++;
                count[fruits[j]]++;
                j++;
            } 
            else{
                res = Math.max(res, j - i);
                while (k == 2) {
                    count[fruits[i]]--;
                    if (count[fruits[i]] == 0) k--;
                    i++;
                }
            }
        }
        return Math.max(res, j - i);
    }
}
