class Solution {
    public int findMinMoves(int[] machines) {
        int total=0;
        for(int m:machines){
            total+=m;
        }
    int n=machines.length;
    if (total % n != 0) return -1; 
    int target=total/n;
    int load=0;
    int  res=0;
    for(int m:machines){
        int diff = m - target; 
            load += diff;          
            res = Math.max(res, Math.max(Math.abs(load), diff));
    }
    return res;
    }
}