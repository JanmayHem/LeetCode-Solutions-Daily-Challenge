class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, List<Integer>> provinces = new HashMap<>();
        int n = isConnected.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && isConnected[i][j]==1){
                    List<Integer> cities = provinces.getOrDefault(i, new ArrayList<>());
                    cities.add(j);
                    provinces.put(i, cities);
                }
            }
        }
        int ans = 0;
        Set<Integer> visited = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!visited.contains(i)){
                ans++;
                dfs(i, provinces, visited);
            }
        }
        return ans;
    }

    private void dfs(int i, Map<Integer, List<Integer>> provinces, Set<Integer> visited) {
        visited.add(i);
        List<Integer> cities = provinces.getOrDefault(i, new ArrayList<>());
        for (int city : cities) {
            if (!visited.contains(city)) dfs(city, provinces, visited);
        }
    }
}
