/*
Runtime: 1 ms Beats 100%
Memory: 44 MB Beats 92.91%
*/

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        if(graph.length==0 || graph[0].length==0) return result;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, result, path, 0);
        return result;
    }

    public void dfs(int[][] Graph, List<List<Integer>> Result, List<Integer> Path, int position){
        if(position == Graph.length-1) Result.add(new ArrayList(Path));
        else{
            for(int i:Graph[position]){
                Path.add(i);
                dfs(Graph, Result, Path, i);
                Path.remove(Path.size()-1);
            }
        }
    }
}
