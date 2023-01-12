/*
Runtime: 69 ms Beats 93.48%
Memory: 108.2 MB Beats 96.74%
*/

class Solution {
    int[] ans;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        ans = new int[n];
        ArrayList<Integer>[] list = new ArrayList[n];
        for(int i=0; i<n; i++) list[i] = new ArrayList<Integer>();
        for(int[] i:edges){
            list[i[0]].add(i[1]);
            list[i[1]].add(i[0]);
        }  
        dfs(-1,0,list,labels);
        return ans;
    }

    public int[] dfs(int previous, int current, ArrayList<Integer>[] list, String labels){
        int[] alphabets = new int[26];
        for(int i:list[current]){
            if(previous!=i){
                int[] res = dfs(current, i, list, labels);
                for(int j=0; j<res.length; j++) alphabets[j]+=res[j];
            }
        }
        ans[current] = ++alphabets[labels.charAt(current)-'a'];
        return alphabets;
    }
}
