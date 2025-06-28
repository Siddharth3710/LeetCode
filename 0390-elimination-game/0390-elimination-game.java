class Solution {
    public int lastRemaining(int n) {
       return helper(n,1);
    }
    private int helper(int n,int p){
        if (n == 1) return 1;
        if(p==1||n%2==1){
              return 2 * helper(n / 2, 1 - p);
        }
        else{
            return 2 * helper(n / 2, 1 - p)-1;
        }
    }
}