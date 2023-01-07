/*
Runtime: 2 ms Beats 89.77%
Memory: 63 MB Beats 61.39%
*/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,avail=0,ind=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            avail+=gas[i]-cost[i];
            if(avail<0){
                avail=0;
                ind=i+1;
            }
        }
        return total<0?-1:ind;
    }
}
