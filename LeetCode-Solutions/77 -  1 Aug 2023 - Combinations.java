/*
Runtime: 17 ms
Beats 75.30%of users with Java

Memory: 45.47 mb
Beats 51.22%of users with Java
*/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] list = new int[n];
        for(int i=0; i<n; i++) list[i] = i+1;
        backkkkk(ans, new ArrayList<>(), list, k, 0);
        return ans;
    }

    private void backkkkk(List<List<Integer>> ans, List<Integer> ansN, int[] list, int k, int curr){
        if(ansN.size() == k){
            ans.add(new ArrayList<>(ansN));
            return;
        }
        for(int i=curr; i<list.length; i++){
            ansN.add(list[i]);
            backkkkk(ans, ansN, list, k, i+1);
            ansN.remove(ansN.size()-1);
        }
    }
}
