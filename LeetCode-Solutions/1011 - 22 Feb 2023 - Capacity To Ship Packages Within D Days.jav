/*
Runtime: 9 ms Beats 95.18%
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight=-1, total=0;
        for(int x: weights){
            maxWeight = Math.max(maxWeight, x);
            total += x;
        }
        int left=maxWeight, right=total;
        while(left<right){
            int mid = (left+right)/2;
            int daysReq=1, curr=0;
            for(int x: weights){
                if(curr+x>mid){
                    daysReq++;
                    curr=0;
                }
                curr+=x;
            }
            if(daysReq > days) left=mid+1;
            else right=mid; 
        }
        return left;
    }
}
