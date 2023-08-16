/*
Java
Runtime: 30 ms
Beats 87.28%

Memory: 59.6 MB
Beats 66.54%
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int j=0;
        for(int i=0; i<n; i++){
            while(dq.size()>0 && dq.peekFirst()<=i-k) dq.pollFirst();
            while(dq.size()>0 && nums[dq.peekLast()]<nums[i]) dq.pollLast();
            dq.offer(i);
            if(i >= k-1) res[j++] = nums[dq.peek()];
        }
        return res;
    }
}
