class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      int [] count = new int[100001];
        for(int [] arr:matches){
            count[arr[0]] = 2;
        }
        for(int [] arr:matches){
            if(count[arr[1]]!=1 && count[arr[1]]!=-1) count[arr[1]]= 1;
            else count[arr[1]]=-1;
            
        }
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i = 0;i<100001;i++){
            if(count[i]==2)arr1.add(i);
            else if (count[i]==1) {
                arr2.add(i);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(arr1);
        result.add(arr2);
        return result;  
    }
}
