/*
Runtime: 12 ms Beats 100%
Memory: 43.7 MB Beats 80.33%
*/

class Solution {
    public int tallestBillboard(int[] rods) {
        int sum=0;
        for(int rod: rods) sum+=rod;
        int[] height = new int[sum+1];
        Arrays.fill(height, -1);
        height[0] = 0;
        for(int rod: rods){
            int[] heightCopy = height.clone();
            for(int i=0; i<sum; i++){
                if(heightCopy[i]<0) continue;
                height[i + rod] = Math.max(height[i + rod], heightCopy[i]);
                height[Math.abs(i-rod)] = Math.max(height[Math.abs(i-rod)],heightCopy[i]+Math.min(i,rod));
            }
        }
        return height[0];
    }
}
