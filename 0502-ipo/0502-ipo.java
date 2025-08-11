class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] proj = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            proj[i][0] = capital[i]; 
            proj[i][1] = profits[i]; 
        }
        
        Arrays.sort(proj, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        int currentCapital = w;
        int idx = 0;
        
        for (int i = 0; i < k; i++) {
            while (idx < n && proj[idx][0] <= currentCapital) {
                pq.offer(proj[idx][1]); 
                idx++;
            }
            
            if (pq.isEmpty()) break; 
            
            currentCapital += pq.poll();
        }
        
        return currentCapital;
    }
}
