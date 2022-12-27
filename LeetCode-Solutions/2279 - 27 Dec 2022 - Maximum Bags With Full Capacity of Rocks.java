/*
Runtime: 14 ms Beats 99.11%
Memory: 52.7 MB Beats 84.66%
*/

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0; i<capacity.length; i++)
            capacity[i] = capacity[i]-rocks[i];
        Arrays.sort(capacity);
        int counter=0;
        for(int i=0; i<capacity.length; i++){
            if(capacity[i]==0)
                counter++;
            else{
                if(additionalRocks>=capacity[i]){
                    additionalRocks=additionalRocks-capacity[i];
                    counter++;
                }
            }
        }
        return counter;
    }
}
