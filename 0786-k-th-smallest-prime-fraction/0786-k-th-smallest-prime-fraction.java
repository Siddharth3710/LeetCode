class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0] / a[1]));
       int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
             pq.offer(new int[]{arr[i], arr[j]});
        }
       }
       int res[]=null;
       for(int i=0;i<k;i++){
        res=pq.poll();
       }
       return res;
    }
}