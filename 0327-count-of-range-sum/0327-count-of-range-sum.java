class Solution {
    public int countRangeSum(int[] nums, int l, int u) {
        long[]  pre=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){ pre[i+1]=pre[i]+nums[i];
}
           
        

       return  count(pre,0,pre.length,l,u);
    }

    private int count(long [] pre,int s,int e,int l,int u){

        if(e-s<=1){
            return 0;
        }
        int mid=s+(e-s)/2;

        int cnt=count(pre,s,mid,l,u)+count(pre,mid,e,l,u);


        int k=mid,j=mid,t=mid;
        long temp[]=new long[e-s];
        int r=0;

        for(int i=s;i<mid;i++){
            while(k<e && pre[k]-pre[i]<l){
                k++;
            }
             while(j<e && pre[j]-pre[i]<=u){
                j++;
            }
            while(t<e && pre[t]<pre[i]){
                temp[r++]=pre[t++];
            }
           temp[ r++]=pre[i];
            cnt+=j-k;
        }
         System.arraycopy(temp, 0, pre, s, r);
        return cnt;
    }
}
