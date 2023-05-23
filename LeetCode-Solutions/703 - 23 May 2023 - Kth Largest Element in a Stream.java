class KthLargest {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(var i: nums) add(i);
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>k) pq.poll();
        return pq.peek(); 
    }
}
