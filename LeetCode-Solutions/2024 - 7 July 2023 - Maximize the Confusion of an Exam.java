/*
Runtime: 13 ms Beats 88.44%
*/

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans=0, n=answerKey.length();
        int left=0, right=0, t=0, f=0;
        while(right<n) {
            if(answerKey.charAt(right) == 'T') t++;
            else f++;
            while (Math.min(t, f) > k) {
                if (answerKey.charAt(left) == 'T') t--;
                else f--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
