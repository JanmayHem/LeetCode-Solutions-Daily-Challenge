/*
Runtime: 0 ms Beats 100%
*/

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];
        for (int i=0; i<n; i++) {
            if (colour[i]==0 && !fillColour(graph,colour,i,1)) return false;
        }
        return true;
    }

    private boolean fillColour(int[][] graph, int[] colour, int i, int col) {
        if(colour[i]!=0) return colour[i]==col;
        colour[i] = col;
        for (int j: graph[i]) {
            if (!fillColour(graph, colour, j, -col)) return false;
        }
        return true;
    }
}
