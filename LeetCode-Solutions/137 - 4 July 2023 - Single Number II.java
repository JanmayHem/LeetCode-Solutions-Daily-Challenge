/*
Runtime: 0 ms Beats 100%
Memory: 43.7 MB Beats 71.19%
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ones=0, more=0;
        for(int num: nums){
            ones = (num^ones)&~more;
            more = (num^more)&~ones;
        }
        return ones;
    }
}

// another method
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) map.put(n, map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }
}
