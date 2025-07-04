class KthLargest {
    private PriorityQueue<Integer>pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();

        for (int num : nums)
          add(num); // Adding K elements to the minHeap and checking the top will give Kth largest element
    
    }
    
    public int add(int val) {
        if(pq.size()<k){
            pq.offer(val);
        }
        else if(val>pq.peek()){
            pq.poll();
            pq.offer(val);
        }

        return pq.peek();    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */