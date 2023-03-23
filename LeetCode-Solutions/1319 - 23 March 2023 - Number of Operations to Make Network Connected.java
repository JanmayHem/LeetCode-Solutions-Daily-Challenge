class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(n-1 > connections.length) return -1; 
        List<Set<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) graph.add(new HashSet<>());
        for(int[] connection : connections){
            int a = connection[0], b = connection[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int[] visited = new int[n];
        int count=0;
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                count++;
                dfs(i, visited, graph);
            }
        }
        return count-1;
    }

    private int dfs(int i, int[] visited, List<Set<Integer>> graph){
        if(visited[i] != 0) return 0;
        visited[i] = 1;
        for(int j : graph.get(i)) dfs(j, visited, graph);
        return 1;
    }
}
