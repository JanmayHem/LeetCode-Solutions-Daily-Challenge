class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        subseq(answer, temp, nums, 0, Integer.MIN_VALUE);
        List result = new ArrayList(answer);
        return result; 
    }

    public static void subseq(Set<List<Integer>> ans, List<Integer> t, int[] num, int index, int previous){
        if(t.size()>1){
            if(!ans.contains(t)) ans.add(new ArrayList<>(t)); 
        }
        for(int i=index; i<num.length; i++){
            if(num[i]>=previous){
                t.add(num[i]);
                subseq(ans, t, num, i+1, num[i]);
                t.remove(t.size()-1);
            }
        }
    }
}
