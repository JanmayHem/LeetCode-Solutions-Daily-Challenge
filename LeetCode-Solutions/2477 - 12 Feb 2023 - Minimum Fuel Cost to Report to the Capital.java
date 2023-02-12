/*
Runtime: 52 ms Beats 97.12%
Memory: 96.8 MB Beats 73.8%
*/

class Solution {
    public long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[] graph = new List[roads.length+1];
        for(int i=0; i<graph.length; ++i) graph[i] = new ArrayList<>();
        for(int[] road: roads){
            final int x=road[0], y=road[1];
            graph[x].add(y);
            graph[y].add(x);
        }        
        dfs(graph, 0, -1, seats);
        return ans;
    }

    private long ans = 0;
    private int dfs(List<Integer>[] graph, int curr, int prev, int seats){
        int rep=1;
        for(final int i: graph[curr]){
            if(i == prev) continue;
            rep += dfs(graph, i, curr, seats); 
        }
        if(curr>0) ans += (rep+seats-1)/seats;
        return rep;
    }
}
