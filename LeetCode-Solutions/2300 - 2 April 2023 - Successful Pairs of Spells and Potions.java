/*
Runtime: 74 ms Beats 67.77%
Memory: 61.2 MB Beats 82.64%
*/

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        int n = spells.length, m = potions.length; 
        Arrays.sort(potions);
        for(int i=0; i<n; i++){
            int left=0, right=m-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                long pdt = (long) spells[i]*potions[mid];
                if(pdt>=success) right = mid-1;
                else left = mid+1; 
            }
            ans[i] = m-left;
        }
        return ans;
    }
}
