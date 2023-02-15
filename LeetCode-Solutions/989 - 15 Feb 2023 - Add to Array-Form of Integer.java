/*
Runtime: 3 ms Beats 97.70%
Memory: 43.5 MB Beats 91.94%
*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int lenN = num.length-1;
        while(lenN>=0 || k>0){
            if(lenN>=0) k+=num[lenN--];
            ans.addFirst(k%10);
            k /= 10;
        }
        return ans;
    }
}
