/*
Runtime: 2 ms Beats 81.19%
Memory: 40.6 MB Beats 97.9%
*/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a=arr[0], b=arr[1];
        int diff = Math.abs(a-b);
        for(int i=2; i<arr.length; i++){
            a = b;
            b = arr[i];
            if(Math.abs(a-b) != diff) return false; 
        }
        return true;
    }
}
