/*
Runtime: 145 ms Beats 72.4%
Memory: 54.8 MB Beats 84.13%
*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int[] days = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(!temp.isEmpty() && temperatures[i]>temperatures[temp.peek()]){
                int index = temp.pop();
                days[index] = i-index;    
            }
            temp.push(i);
        }
        return days;
    }   
}
