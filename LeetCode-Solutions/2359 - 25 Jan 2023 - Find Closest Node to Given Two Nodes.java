class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length, result=-1, dist=Integer.MAX_VALUE;
        int[] nodeDist1=new int[n], nodeDist2=new int[n];
        boolean[] visited1=new boolean[n], visited2=new boolean[n];
        dfs(edges, node1, nodeDist1, visited1);
        dfs(edges, node2, nodeDist2, visited2);
        for(int i=0; i<n; i++){
            if(visited1[i] && visited2[i] && dist>Math.max(nodeDist1[i], nodeDist2[i])){
                dist = Math.max(nodeDist1[i], nodeDist2[i]);
                result = i;
            }
        }   
        return result;
    }

    public void dfs(int[] edges, int node, int[] nodeDist, boolean[] visited){
        visited[node]=true;
        int curr = edges[node];
        if(curr!=-1 && !visited[curr]){
            nodeDist[curr] = nodeDist[node]+1;
            dfs(edges, curr, nodeDist, visited);
        }
    }
}
