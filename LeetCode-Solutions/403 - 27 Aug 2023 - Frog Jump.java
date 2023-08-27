class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if(stones[1]!=1) return false;
        boolean[][] dp = new boolean[n][n];
        return helper(stones, dp, 1, 1);
    }

    private boolean helper(int[] stones, boolean[][] visited, int stone, int prevJump){
        if(stone>=stones.length-1) return true;
        if(visited[stone][prevJump]) return false;
        visited[stone][prevJump] = true;
        int nextStone = stone+1;
        while(nextStone<stones.length && stones[nextStone]<stones[stone]+prevJump-1) nextStone++;
        if(nextStone<stones.length && stones[nextStone]==stones[stone]+prevJump-1 && helper(stones, visited, nextStone++, prevJump-1)) return true;
        if(nextStone<stones.length && stones[nextStone]==stones[stone]+prevJump && helper(stones, visited, nextStone++, prevJump)) return true;
        return (nextStone<stones.length && stones[nextStone]==stones[stone]+prevJump+1 && helper(stones, visited, nextStone++, prevJump+1));  
    }
}
