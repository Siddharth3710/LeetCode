class Solution {
    public int hammingWeight(int n) {
        int bit=1;
        int cnt=0;

        while(n>0){
            if((n & bit)==1){
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }
}