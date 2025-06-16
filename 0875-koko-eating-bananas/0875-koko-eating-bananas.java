class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int pile:piles){
            r=Math.max(r,pile);
        }

        while(l<r){
            int mid=l+(r-l)/2;
            if(can(piles,h,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
    private boolean can(int []piles,int h,int k){
        int hrs=0;

        for(int pile:piles){
            hrs+=(pile+k-1)/k;
        }

        return hrs<=h;

    }
}