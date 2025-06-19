class Solution {
    public int maxProduct(int[] arr) {
       int ans=Integer.MIN_VALUE;
       int pre=1;
       int suf=1;
       int n=arr.length;

       for(int i=0;i<n;i++){
        if(pre==0){
            pre=1;
        } if(suf==0){
            suf=1;
        }
        pre=pre*arr[i];
        suf=suf*arr[n-i-1];

        ans=Math.max(ans,Math.max(suf,pre));
       }


       return ans;

        
    }
}