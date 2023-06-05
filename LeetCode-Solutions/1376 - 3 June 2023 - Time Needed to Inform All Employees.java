class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> employees = new ArrayList<>();
        for(int i=0; i<n; i++) employees.add(new ArrayList<>());
        for(int i=0; i<n; i++){
            int u=i, v=manager[i]; 
            if(v!=-1) employees.get(v).add(u); 
        }
        return dfs(headID, employees, informTime);
    }

    public int dfs(int node, List<List<Integer>> employees, int informTime[]) {
        int ans = 0;
        for(Integer adjNode: employees.get(node)) ans = Math.max(ans,dfs(adjNode,employees,informTime));
        return ans+informTime[node];
    }
}
