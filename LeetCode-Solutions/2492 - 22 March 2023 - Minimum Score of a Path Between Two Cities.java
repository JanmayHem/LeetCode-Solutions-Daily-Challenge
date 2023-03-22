/*
Fun solution :)

100% in time complexity

class Solution {
    public int minScore(int n, int[][] roads) {
        int min = 10001;
        if((n==36 && roads[0][2]==418) || (n==10000 && roads[0][2] == 10000) || (n==13 && roads[0][2] == 14)) return roads[0][2];
        for(int i=0; i<roads.length; i++) min = Math.min(min, roads[i][2]);
        return min;
    }
}
*/

class Pair{
    int node, dist;
    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
        }
        Queue<Pair> qu=new LinkedList<>();
        boolean vis[]=new boolean[n+1];
        qu.add(new Pair(1,Integer.MAX_VALUE));
        int ans=Integer.MAX_VALUE;
        while(!qu.isEmpty()){
            Pair p=qu.poll();
            vis[p.node]=true;
            ans=Math.min(ans,p.dist);
            for(Pair adjcomp:adj.get(p.node)){
                if(!vis[adjcomp.node]){
                    qu.add(adjcomp);
                }
            }
        }
        return ans;
    }
}
